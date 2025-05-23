"""
  extract exchanges metadata from ts files and create json data
"""

# pylint: disable=line-too-long, bare-except, invalid-name, redefined-outer-name, broad-exception-caught

import re
import json
import sys
import glob
import logging as log
from json.encoder import JSONEncoder

log.basicConfig(filename='app.log', level=log.DEBUG)


def recursive_merge(dict1, dict2) -> any:
    """
    Recursively merge two dictionaries.
    """

    base = dict1.copy()
    for key, value in dict2.items():
        if key in dict1 and isinstance(base[key], dict) and isinstance(value, dict):
            # Recursively merge nested dictionaries
            base[key] = recursive_merge(base[key], value)
        else:
            # Merge non-dictionary values
            base[key] = value
    return base


def extract_raw_ws_req(ts_base_path: str, exchange_name: str, functions_name: list[str]) -> dict:
    """
    extract ws request from exchange function definition
    """

    result = {}

    with open(f'{ts_base_path}/src/pro/{exchange_name}.ts', mode='r', encoding='utf-8') as f:

        for function_name in functions_name:
            f.seek(0)
            function_lines = []
            temp_request_json = []
            request_json_str = ''
            request_json = {}
            function_def_re = re.compile(f'^[ ]+async {function_name} [(]')
            count = 0
            count_request = 0
            for line in f.readlines():
                if function_def_re.search(line) is not None:
                    count = 1
                    function_lines.append(line.strip())
                    continue
                if len(function_lines) > 0:
                    if line.strip() == '':
                        continue

                    function_lines.append(line.strip())

                    if re.search(r'^if ', line.strip()) is None:
                        if len(temp_request_json) > 0:
                            count_request += line.count('{')
                            count_request -= line.count('}')

                            request_str = re.sub(r'\'([A-Za-z0-9\._]+)\'\s*:\s*([^\'{\["][A-Za-z0-9\._]+[^\'"\]}])(,)?', r'"\1": "{\2}"\3', line.strip())
                            request_str = re.sub(r"^'", r'"', request_str)
                            request_str = re.sub(r"'([,: ])", r'"\1', request_str)
                            request_str = re.sub(r"(\s+)'", r'\1"', request_str)
                            request_str = re.sub('[,;]$', '', request_str)
                            request_str = re.sub(r'// .*', '', request_str)
                            request_str = re.sub(r'//$', '', request_str)
                            request_str = re.sub(r"\\'", "'", request_str)

                            if count_request == 0:
                                temp_request_json.append('}')
                                request_json_str = ','.join(temp_request_json)
                                request_json_str = re.sub(r'([{\[]),', r'\1', request_json_str)
                                request_json_str = re.sub(r',([}\]])', r'\1', request_json_str)
                                request_json_str = re.sub(r'"{(true|false|null)}"', r'\1', request_json_str)
                                request_json_str = re.sub(r'(this\.[^(]+\([^)]+\))\s*(\.toString\s*\(\))?',
                                                          lambda s:
                                                          JSONEncoder().encode(
                                                              r'{' + s.group(1) + r'}'), request_json_str)

                                request_json_str = re.sub(r',(\s*)([\]}])', r'\1\2', request_json_str, flags=re.DOTALL)
                                request_json_str = re.sub(r'\[\s*([A-Za-z0-9_]+)\s*\]', r'["{\1}"]', request_json_str)

                                temp_request_json = []

                                try:
                                    request_json = {
                                        'encoded': False,
                                        'template': json.loads(request_json_str)
                                    }
                                except Exception:
                                    request_json = {
                                        'encoded': True,
                                        'template': JSONEncoder().encode(request_json_str)
                                    }

                            else:
                                temp_request_json.append(request_str)

                        if re.search(r'request: Dict = {', line) is not None:
                            count_request = 1
                            temp_request_json.append('{')

                    count += line.count('{')
                    count -= line.count('}')
                    if count == 0:
                        break

            f.seek(0)
            comments = []

            for line in f:
                temp_comments = []
                if re.search(r'/[*][*]', line) is not None:
                    temp_comments.append(line.strip())
                    next_line = f.readline()
                    if re.search(r'[*] @method', next_line) is not None:
                        next_line = f.readline()
                        if re.search(f'[*] @name {exchange_name}#{function_name}', next_line) is not None:
                            count = 1
                            comments.extend(temp_comments)
                            comments.append(next_line.strip())
                            continue
                        else:
                            temp_comments = []
                            continue
                    else:
                        temp_comments = []
                        continue
                else:
                    temp_comments = []

                if len(comments) > 0:
                    comments.append(line.strip())
                    if re.search(r'^[ ]+[*]/', line) is not None:
                        break

            function_raw = function_lines

            result[f'{exchange_name}.{function_name}'] = {}
            result[f'{exchange_name}.{function_name}']['request_template'] = request_json
            result[f'{exchange_name}.{function_name}']['raw'] = function_raw
            result[f'{exchange_name}.{function_name}']['comments'] = comments

    return result


def extract_json(ts_source: str, begin_str: str, ignore_null: bool = False) -> str:
    """
    extract json from ts file
    """
    extracted = []
    jsonp = "{}"
    json_dict = {}
    eval_re_str = r': ([-\.0-9]+( . [-\.0-9]+)+)'

    # from "ts/src/base/exchange.ts"
    user_agents = {
        'chrome': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36',
        'chrome39': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36',
        'chrome100': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36'
    }

    with open(ts_source, mode='r', encoding='utf-8') as f:
        count = 0
        begin = re.compile(begin_str)
        ignore_return = re.compile('return {')
        ignore_undefined = re.compile(r': (undefined|{[ ]?})')
        eval_re = re.compile(eval_re_str)
        for line in f:
            if begin.search(line) is not None:
                extracted.append('{')
                count = 1
                continue
            if len(extracted) > 0:
                if ignore_return.search(line) is not None:
                    continue
                if ignore_null and ignore_undefined.search(line):
                    continue

                line_re = re.sub(r"(\s+)'", r'\1"', line)
                line_re = re.sub(r"'([,: ]+)", r'"\1', line_re)
                line_re = re.sub(r"'$", r'"', line_re)
                line_re = re.sub(': ([A-Za-z]+),', r': "\1",', line_re)
                line_re = re.sub(r'"?undefined"?', 'null', line_re)
                line_re = re.sub(r'"(false|true|null)"', r'\1', line_re)
                line_re = re.sub('this.timeout', '10000', line_re)
                line_re = re.sub(';$', '', line_re)
                line_re = re.sub(r'\)$', '', line_re)
                line_re = re.sub(r'// .*', '', line_re)
                line_re = re.sub(r'//$', '', line_re)
                line_re = re.sub(r"\\'", "'", line_re)

                # from "ts/src/base/functions/number.ts"
                line_re = re.sub('TRUNCATE', '0', line_re)
                line_re = re.sub('ROUND', '1', line_re)
                line_re = re.sub('ROUND_UP', '2', line_re)
                line_re = re.sub('ROUND_DOWN', '3', line_re)
                line_re = re.sub('DECIMAL_PLACES', '2', line_re)
                line_re = re.sub('SIGNIFICANT_DIGITS', '3', line_re)
                line_re = re.sub('TICK_SIZE', '4', line_re)
                line_re = re.sub('NO_PADDING', '5', line_re)
                line_re = re.sub('PAD_WITH_ZERO', '6', line_re)

                line_re = re.sub(r"this.userAgents\['chrome'\]", f"\"{user_agents['chrome']}\"", line_re)
                line_re = re.sub(r"this.userAgents\['chrome39'\]", f"\"{user_agents['chrome39']}\"", line_re)
                line_re = re.sub(r"this.userAgents\['chrome100'\]", f"\"{user_agents['chrome100']}\"", line_re)

                line_re = re.sub('this.safe(Market|Currency)Structure [(]({.*})[)]', r'\2', line_re)
                line_re = re.sub('this.parseToInt [(](.*)[)]', r'\1', line_re)
                line_re = re.sub('this.parseNumber .[\'"]([-0-9.]+)[\'"].', r'"\1"', line_re)
                line_re = re.sub('this.ping', r'"{ping}"', line_re)
                line_re = re.sub('this.createSafeDictionary [(][)]', r'{}', line_re)
                line_re = re.sub(r'" \+ "', '', line_re)

                eval_match = eval_re.search(line_re)
                if eval_match is not None:
                    eval_result = eval(eval_match.group(1))  # pylint: disable=eval-used
                    line_re = re.sub(eval_re_str, f': {eval_result}', line_re)

                if line_re.strip() == '':
                    continue

                extracted.append(line_re)

                count += line_re.count('{')
                count -= line_re.count('}')
                if count == 0:
                    break

    jsonp = re.sub(r',\s*\n(\s*)([\]}])', r'\n\1\2', ''.join(extracted), flags=re.DOTALL)
    try:
        json_dict = json.loads(jsonp)
    except Exception as e:
        if jsonp.strip() == '':
            log.error('Empty JSONP')
        else:
            log.error(jsonp)
        log.error(e, stack_info=True)

    return json_dict


ts_base_path = sys.argv[1] if len(sys.argv) > 1 else '../ts'
exchanges_data_file = sys.argv[2] if len(sys.argv) > 2 else './src/main/resources/exchanges.json'
functions_list_file = sys.argv[2] if len(sys.argv) > 2 else './src/main/resources/functions.list'

begin_str_base = r'describe ..: any {$'
begin_str_exchange = r'(return this.deepExtend .(super.describe .., {|extended, {|describeExtended, {)|^[ ]+describeData .. {)'

exchange_base = extract_json(f'{ts_base_path}/src/base/Exchange.ts', begin_str_base, ignore_null=False)
exchange_base = recursive_merge(exchange_base, {'markets': {}})

blacklist = ["digifinex"]
exchanges = {}
all_functions = set()

exchange_name_re = re.compile(f'{ts_base_path}/src/([A-Za-z0-9]+).ts')

for exchange_file in glob.glob(f'{ts_base_path}/src/*.ts'):
    exchange = {}
    exchange_match = exchange_name_re.match(exchange_file)
    if exchange_match is not None:
        exchange_name = exchange_match.group(1)
        if exchange_name in blacklist:
            continue
        exchange_def = extract_json(exchange_file, begin_str_exchange, ignore_null=True)
        exchange = recursive_merge(exchange_base, exchange_def)
        exchanges[exchange_name] = exchange

exchange_name_re = re.compile(f'{ts_base_path}/src/pro/([A-Za-z0-9]+).ts')

for exchange_file in glob.glob(f'{ts_base_path}/src/pro/*.ts'):
    exchange = {}
    exchange_match = exchange_name_re.match(exchange_file)
    if exchange_match is not None:
        exchange_name = exchange_match.group(1)
        if exchange_name in blacklist:
            continue
        exchange_def = extract_json(exchange_file, begin_str_exchange, ignore_null=True)
        if 'has' in exchange_def:
            function_names = [function_name
                              for function_name, has_function in exchange_def['has'].items()
                              if function_name != 'ws' and has_function]
            exchange_def['functions_ws_req'] = extract_raw_ws_req(ts_base_path, exchange_name, function_names)
            all_functions.update(function_names)

        exchange = recursive_merge(exchanges[exchange_name], exchange_def)
        exchanges[exchange_name] = exchange

json_exchanges = json.dumps(exchanges, indent=4, sort_keys=True, ensure_ascii=False)
with open(exchanges_data_file, 'w', encoding='utf-8') as f:
    f.write(json_exchanges)

verbs_prefix = [
    "add",
    "borrow",
    "cancel",
    "close",
    "create",
    "deposit",
    "edit",
    "fetch",
    "future",
    "margin",
    "option",
    "reduce",
    "repay",
    "set",
    "signIn",
    "spot",
    "swap",
    "tranfer",
    "watch",
    "withdraw"
]

filtered_functions = [function_name for function_name in all_functions if function_name.startswith(tuple(verbs_prefix))]
with open(functions_list_file, 'w', encoding='utf-8') as f:
    f.write('\n'.join(sorted(filtered_functions)))

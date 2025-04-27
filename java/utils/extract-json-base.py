import re
import json
import sys
import glob
import logging as log

log.basicConfig(filename='app.log', level=log.DEBUG)

def recursive_merge(dict1, dict2):
    base = dict1.copy()
    for key, value in dict2.items():
        if key in dict1 and isinstance(base[key], dict) and isinstance(value, dict):
            # Recursively merge nested dictionaries
            base[key] = recursive_merge(base[key], value)
        else:
            # Merge non-dictionary values
            base[key] = value
    return base

def extract_json(ts_source: str, begin_str: str, ignore_null: bool = False) -> str:
  extracted = []
  jsonp = "{}"
  json_dict = {}
  user_agents = {
    'chrome': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36',
    'chrome39': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36',
    'chrome100': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36'
  }

  with open(ts_source, encoding='utf-8') as f:
    count = 0
    begin = re.compile(begin_str)
    open_brace = re.compile('{')
    close_brace = re.compile('}')
    ignore_return = re.compile('return {')
    ignore_undefined = re.compile(': undefined')
    eval_re = re.compile(r': ([-\.0-9]+( . [-\.0-9]+)+)')
    for line in f.readlines():
      if begin.search(line) is not None:
        extracted.append('{')
        count = 1
        continue
      if len(extracted) > 0:
        if ignore_return.search(line) is not None:
          continue
        if ignore_null and ignore_undefined.search(line):
          continue

        line_re = re.sub(r" '", r' "', line)
        line_re = re.sub(r"':", r'":', line_re)
        line_re = re.sub(r"',", r'",', line_re)
        line_re = re.sub(r"'$", r'"', line_re)
        line_re = re.sub(r"'([ ]+)", r'"\1', line_re)
        line_re = re.sub(': ([A-Za-z]+),', r': "\1",', line_re)
        line_re = re.sub(r'"undefined"', 'null', line_re)
        line_re = re.sub(r'"false"', 'false', line_re)
        line_re = re.sub(r'"true"', 'true', line_re)
        line_re = re.sub(r'"null"', 'null', line_re)
        line_re = re.sub(r'undefined', 'null', line_re)
        line_re = re.sub('this.timeout', '10000', line_re)
        line_re = re.sub(';$', '', line_re)
        line_re = re.sub(r'\)$', '', line_re)
        line_re = re.sub(r'// .*', '', line_re)
        line_re = re.sub(r'//$', '', line_re)
        line_re = re.sub(r"\\'", "'", line_re)

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

        line_re = re.sub('this.safeMarketStructure [(]({.*})[)]', r'\1', line_re)
        line_re = re.sub('this.safeCurrencyStructure [(]({.*})[)]', r'\1', line_re)
        line_re = re.sub('this.parseToInt [(](.*)[)]', r'\1', line_re)
        line_re = re.sub('this.parseNumber .[\'"]([-0-9.]+)[\'"].', r'"\1"', line_re)
        line_re = re.sub(r'" \+ "', '', line_re)

        eval_match = eval_re.search(line_re)
        if eval_match is not None:
          eval_result = eval(eval_match.group(1))
          line_re = re.sub( r': ([-\.0-9]+( . [-\.0-9]+)+)', f': {eval_result}', line_re)

        if line_re.strip() == '':
          continue

        extracted.append(line_re)

        if open_brace.search(line) is not None:
          count += 1
        if close_brace.search(line) is not None:
          count -= 1
        if count == 0:
          break

  jsonp = re.sub(r',\s*\n(\s*)([\]}])',r'\n\1\2', ''.join(extracted), flags=re.DOTALL)
  try:
    json_dict = json.loads(jsonp)
  except:
    log.error(jsonp)

  return json_dict

ts_base_path = '../../ts'
if len(sys.argv) > 1:
  ts_base_path = sys.argv[1]

begin_str_base = r'describe ..: any {$'
begin_str_exchange = r'return this.deepExtend .super.describe .., {'

exchange_base = extract_json(f'{ts_base_path}/src/base/Exchange.ts', begin_str_base)
exchange_base = recursive_merge(exchange_base, { 'markets': {} })

blacklist = [ "digifinex" ]
exchanges = []
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
    exchanges.append(exchange)

print(json.dumps(exchanges, indent=2))


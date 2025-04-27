#!env bash

JSON_DIR="./src/main/resources/json-schema/"
JAVA_DIR="./src/main/java/dev/tuxmonteiro/jccxt/base/types/"
TYPES_TS="../ts/src/base/types.ts"

rm -f ${JSON_PATH}/*.json

# typescript to json-schema
grep 'export interface' ${TYPES_TS} | grep -v Dictionary | awk '{ print $3 }' | while read class; do
  echo $class
  # npm install --save ts-json-schema-generator
  npx ts-json-schema-generator --path ${TYPES_TS} --type $class > $JSON_DIR/${class%Interface}.json
  sed -i 's/Interface//g' $JSON_DIR/${class%Interface}.json
done

## Automatic fix DepositWithdrawFee.json (networks)
sed -i 's|"$ref": "#/definitions/Dictionary%3CDepositWithdrawFeeNetwork%3E"|"type":"array","items":{"$ref":"#/definitions/DepositWithdrawFeeNetwork"}|' ${JSON_DIR}/DepositWithdrawFee.json

# json-schema to Java POJO
ls -1 ${JSON_DIR} | grep '.json' | sed 's/.json//' | while read class; do

  # https://github.com/joelittlejohn/jsonschema2pojo/releases
  echo -e 'package dev.tuxmonteiro.jccxt.base.types;\n' > ${JAVA_DIR}/$class.java
  ./utils/jsonschema2pojo-1.2.2/bin/jsonschema2pojo -o -sl -s ${JSON_DIR}/$class.json -t ${JSON_DIR} -log trace
  [ -f ${JSON_DIR}/$class.java ] && cat ${JSON_DIR}/$class.java >> ${JAVA_DIR}/$class.java || rm -vf ${JAVA_DIR}/$class.java
  rm -f ${JSON_DIR}/$class.java 
  echo
done

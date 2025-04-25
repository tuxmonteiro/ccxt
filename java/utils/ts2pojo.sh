#!env bash

JSON_DIR="../../../../../../resources/json-schema/"

# typescript to json-schema
grep 'export interface' types.ts | grep -v Dictionary | awk '{ print $3 }' | while read class; do
  echo $class
  # npm install --save ts-json-schema-generator
  #npx ts-json-schema-generator --path types.ts --type $class > $JSON_DIR/${class%Interface}.json
  sed -i 's/Interface//g' $JSON_DIR/${class%Interface}.json
done

## TODO: Automatic fix DepositWithdrawFee.json (networks)

# json-schema to Java POJO
ls -1 ../../../../../../resources/json-schema/ | sed 's/.json//' | while read class; do

  # https://github.com/joelittlejohn/jsonschema2pojo/releases
  echo -e 'package dev.tuxmonteiro.jccxt.base.types;\n' > $class.java
  ./jsonschema2pojo-1.2.2/bin/jsonschema2pojo -o -sl -s $JSON_DIR/$class.json -t generated -log trace
  [ -f generated/$class.java ] && cat generated/$class.java >> $class.java || rm -f $class.java
  echo
done

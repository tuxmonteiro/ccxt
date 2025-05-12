#!env bash

FUNCTIONS_LIST="./src/main/resources/functions.list"
FUNCTIONS_INTERFACE_DIR="./src/main/java/dev/tuxmonteiro/jccxt/base/types/functions"

mkdir -p $FUNCTIONS_INTERFACE_DIR

IFS=$'\n'
cat $FUNCTIONS_LIST | while read functionName; do

cat <<EOF > $FUNCTIONS_INTERFACE_DIR/${functionName^}Interface.java
package dev.tuxmonteiro.jccxt.base.types;

import java.util.function.Function;

@FunctionalInterface
public interface ${functionName^}Interface<T, R> extends Function<T, R> {}

EOF

done
#

package dev.tuxmonteiro.jccxt.base.types;

import java.util.function.Function;

@FunctionalInterface
public interface WatchOrdersForSymbolsInterface<T, R> extends Function<T, R> {}


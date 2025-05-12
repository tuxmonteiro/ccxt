package dev.tuxmonteiro.jccxt.base.types;

import java.util.function.Function;

@FunctionalInterface
public interface WatchBalanceInterface<T, R> extends Function<T, R> {}


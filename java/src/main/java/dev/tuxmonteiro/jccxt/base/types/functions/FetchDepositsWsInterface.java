package dev.tuxmonteiro.jccxt.base.types;

import java.util.function.Function;

@FunctionalInterface
public interface FetchDepositsWsInterface<T, R> extends Function<T, R> {}


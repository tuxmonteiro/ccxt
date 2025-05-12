package dev.tuxmonteiro.jccxt.base.types;

import java.util.function.Function;

@FunctionalInterface
public interface FetchTimeWsInterface<T, R> extends Function<T, R> {}


package dev.tuxmonteiro.jccxt.base.types;

import java.util.function.Function;

@FunctionalInterface
public interface WatchMarkPriceInterface<T, R> extends Function<T, R> {}


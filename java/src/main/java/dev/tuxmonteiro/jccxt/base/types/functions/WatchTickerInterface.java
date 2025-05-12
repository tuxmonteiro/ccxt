package dev.tuxmonteiro.jccxt.base.types;

import java.util.function.Function;

@FunctionalInterface
public interface WatchTickerInterface<T, R> extends Function<T, R> {}


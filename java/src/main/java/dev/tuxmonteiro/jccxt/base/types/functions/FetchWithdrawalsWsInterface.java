package dev.tuxmonteiro.jccxt.base.types;

import java.util.function.Function;

@FunctionalInterface
public interface FetchWithdrawalsWsInterface<T, R> extends Function<T, R> {}


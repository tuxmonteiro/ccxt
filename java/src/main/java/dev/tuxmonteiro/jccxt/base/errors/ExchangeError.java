package dev.tuxmonteiro.jccxt.base.errors;

public class ExchangeError extends BaseError {
    public ExchangeError() {
        super();
    }

    public ExchangeError(String message) {
        super(message);
    }

    public ExchangeError(String message, BaseError inner) {
        super(message, inner);
    }
}

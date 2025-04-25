package dev.tuxmonteiro.jccxt.base.errors;

public class UnsubscribeError extends BaseError {
    public UnsubscribeError() {
        super();
    }

    public UnsubscribeError(String message) {
        super(message);
    }

    public UnsubscribeError(String message, BaseError inner) {
        super(message, inner);
    }
}

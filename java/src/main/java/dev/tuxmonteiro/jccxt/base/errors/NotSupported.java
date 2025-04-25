package dev.tuxmonteiro.jccxt.base.errors;

public class NotSupported extends ExchangeError {
    public NotSupported() {
        super();
    }

    public NotSupported(String message) {
        super(message);
    }

    public NotSupported(String message, ExchangeError inner) {
        super(message, inner);
    }
}

package dev.tuxmonteiro.jccxt.base.errors;

public class AuthenticationError extends ExchangeError {
    public AuthenticationError() {
        super();
    }

    public AuthenticationError(String message) {
        super(message);
    }

    public AuthenticationError(String message, ExchangeError inner) {
        super(message, inner);
    }
}

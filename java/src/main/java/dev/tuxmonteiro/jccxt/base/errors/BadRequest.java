package dev.tuxmonteiro.jccxt.base.errors;

public class BadRequest extends ExchangeError {
    public BadRequest() {
        super();
    }

    public BadRequest(String message) {
        super(message);
    }

    public BadRequest(String message, ExchangeError inner) {
        super(message, inner);
    }
}

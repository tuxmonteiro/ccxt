package dev.tuxmonteiro.jccxt.base.errors;

public class ExchangeClosedByUser extends ExchangeError {
    public ExchangeClosedByUser() {
        super();
    }

    public ExchangeClosedByUser(String message) {
        super(message);
    }

    public ExchangeClosedByUser(String message, ExchangeError inner) {
        super(message, inner);
    }
}

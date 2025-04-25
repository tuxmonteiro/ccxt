package dev.tuxmonteiro.jccxt.base.errors;

public class InvalidAddress extends ExchangeError {
    public InvalidAddress() {
        super();
    }

    public InvalidAddress(String message) {
        super(message);
    }

    public InvalidAddress(String message, ExchangeError inner) {
        super(message, inner);
    }
}

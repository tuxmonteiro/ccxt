package dev.tuxmonteiro.jccxt.base.errors;

public class InvalidOrder extends ExchangeError {
    public InvalidOrder() {
        super();
    }

    public InvalidOrder(String message) {
        super(message);
    }

    public InvalidOrder(String message, ExchangeError inner) {
        super(message, inner);
    }
}

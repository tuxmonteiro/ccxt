package dev.tuxmonteiro.jccxt.base.errors;

public class InsufficientFunds extends ExchangeError {
    public InsufficientFunds() {
        super();
    }

    public InsufficientFunds(String message) {
        super(message);
    }

    public InsufficientFunds(String message, ExchangeError inner) {
        super(message, inner);
    }
}

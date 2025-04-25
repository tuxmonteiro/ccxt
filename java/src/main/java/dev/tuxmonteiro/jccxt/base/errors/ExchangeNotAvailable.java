package dev.tuxmonteiro.jccxt.base.errors;

public class ExchangeNotAvailable extends NetworkError {
    public ExchangeNotAvailable() {
        super();
    }

    public ExchangeNotAvailable(String message) {
        super(message);
    }

    public ExchangeNotAvailable(String message, NetworkError inner) {
        super(message, inner);
    }
}

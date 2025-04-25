package dev.tuxmonteiro.jccxt.base.errors;

public class ArgumentsRequired extends ExchangeError {
    public ArgumentsRequired() {
        super();
    }

    public ArgumentsRequired(String message) {
        super(message);
    }

    public ArgumentsRequired(String message, ExchangeError inner) {
        super(message, inner);
    }
}

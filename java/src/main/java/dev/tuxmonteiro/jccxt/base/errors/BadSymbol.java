package dev.tuxmonteiro.jccxt.base.errors;

public class BadSymbol extends BadRequest {
    public BadSymbol() {
        super();
    }

    public BadSymbol(String message) {
        super(message);
    }

    public BadSymbol(String message, BadRequest inner) {
        super(message, inner);
    }
}

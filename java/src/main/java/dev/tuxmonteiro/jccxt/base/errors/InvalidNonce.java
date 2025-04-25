package dev.tuxmonteiro.jccxt.base.errors;

public class InvalidNonce extends NetworkError {
    public InvalidNonce() {
        super();
    }

    public InvalidNonce(String message) {
        super(message);
    }

    public InvalidNonce(String message, NetworkError inner) {
        super(message, inner);
    }
}

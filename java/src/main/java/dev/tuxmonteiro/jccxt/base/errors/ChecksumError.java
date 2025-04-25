package dev.tuxmonteiro.jccxt.base.errors;

public class ChecksumError extends InvalidNonce {
    public ChecksumError() {
        super();
    }

    public ChecksumError(String message) {
        super(message);
    }

    public ChecksumError(String message, InvalidNonce inner) {
        super(message, inner);
    }
}

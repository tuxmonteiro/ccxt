package dev.tuxmonteiro.jccxt.base.errors;

public class BadResponse extends OperationFailed {
    public BadResponse() {
        super();
    }

    public BadResponse(String message) {
        super(message);
    }

    public BadResponse(String message, OperationFailed inner) {
        super(message, inner);
    }
}

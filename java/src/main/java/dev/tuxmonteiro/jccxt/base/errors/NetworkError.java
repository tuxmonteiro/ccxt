package dev.tuxmonteiro.jccxt.base.errors;

public class NetworkError extends OperationFailed {
    public NetworkError() {
        super();
    }

    public NetworkError(String message) {
        super(message);
    }

    public NetworkError(String message, OperationFailed inner) {
        super(message, inner);
    }
}

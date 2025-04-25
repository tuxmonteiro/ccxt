package dev.tuxmonteiro.jccxt.base.errors;

public class OperationFailed extends BaseError {
    public OperationFailed() {
        super();
    }

    public OperationFailed(String message) {
        super(message);
    }

    public OperationFailed(String message, BaseError inner) {
        super(message, inner);
    }
}

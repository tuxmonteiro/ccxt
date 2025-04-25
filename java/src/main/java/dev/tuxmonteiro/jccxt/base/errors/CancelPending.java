package dev.tuxmonteiro.jccxt.base.errors;

public class CancelPending extends OperationFailed {
    public CancelPending() {
        super();
    }

    public CancelPending(String message) {
        super(message);
    }

    public CancelPending(String message, OperationFailed inner) {
        super(message, inner);
    }
}

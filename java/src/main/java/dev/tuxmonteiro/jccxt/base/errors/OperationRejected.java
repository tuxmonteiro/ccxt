package dev.tuxmonteiro.jccxt.base.errors;

public class OperationRejected extends ExchangeError {
    public OperationRejected() {
        super();
    }

    public OperationRejected(String message) {
        super(message);
    }

    public OperationRejected(String message, ExchangeError inner) {
        super(message, inner);
    }
}

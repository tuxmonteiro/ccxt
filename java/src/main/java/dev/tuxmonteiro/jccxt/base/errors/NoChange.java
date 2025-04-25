package dev.tuxmonteiro.jccxt.base.errors;

public class NoChange extends OperationRejected {
    public NoChange() {
        super();
    }

    public NoChange(String message) {
        super(message);
    }

    public NoChange(String message, OperationRejected inner) {
        super(message, inner);
    }
}

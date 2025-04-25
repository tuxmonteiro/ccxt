package dev.tuxmonteiro.jccxt.base.errors;

public class ManualInteractionNeeded extends OperationRejected {
    public ManualInteractionNeeded() {
        super();
    }

    public ManualInteractionNeeded(String message) {
        super(message);
    }

    public ManualInteractionNeeded(String message, OperationRejected inner) {
        super(message, inner);
    }
}

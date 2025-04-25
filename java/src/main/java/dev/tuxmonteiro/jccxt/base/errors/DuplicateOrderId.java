package dev.tuxmonteiro.jccxt.base.errors;

public class DuplicateOrderId extends InvalidOrder {
    public DuplicateOrderId() {
        super();
    }

    public DuplicateOrderId(String message) {
        super(message);
    }

    public DuplicateOrderId(String message, InvalidOrder inner) {
        super(message, inner);
    }
}

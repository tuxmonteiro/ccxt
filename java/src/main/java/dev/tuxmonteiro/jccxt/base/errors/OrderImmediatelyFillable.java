package dev.tuxmonteiro.jccxt.base.errors;

public class OrderImmediatelyFillable extends InvalidOrder {
    public OrderImmediatelyFillable() {
        super();
    }

    public OrderImmediatelyFillable(String message) {
        super(message);
    }

    public OrderImmediatelyFillable(String message, InvalidOrder inner) {
        super(message, inner);
    }
}

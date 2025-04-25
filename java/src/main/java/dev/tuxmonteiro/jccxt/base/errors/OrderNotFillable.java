package dev.tuxmonteiro.jccxt.base.errors;

public class OrderNotFillable extends InvalidOrder {
    public OrderNotFillable() {
        super();
    }

    public OrderNotFillable(String message) {
        super(message);
    }

    public OrderNotFillable(String message, InvalidOrder inner) {
        super(message, inner);
    }
}

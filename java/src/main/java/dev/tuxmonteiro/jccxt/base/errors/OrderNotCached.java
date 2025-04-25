package dev.tuxmonteiro.jccxt.base.errors;

public class OrderNotCached extends InvalidOrder {
    public OrderNotCached() {
        super();
    }

    public OrderNotCached(String message) {
        super(message);
    }

    public OrderNotCached(String message, InvalidOrder inner) {
        super(message, inner);
    }
}

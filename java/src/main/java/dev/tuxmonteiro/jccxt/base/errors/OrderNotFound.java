package dev.tuxmonteiro.jccxt.base.errors;

public class OrderNotFound extends InvalidOrder {
    public OrderNotFound() {
        super();
    }

    public OrderNotFound(String message) {
        super(message);
    }

    public OrderNotFound(String message, InvalidOrder inner) {
        super(message, inner);
    }
}

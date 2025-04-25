package dev.tuxmonteiro.jccxt.base.errors;

public class MarketClosed extends OperationRejected {
    public MarketClosed() {
        super();
    }

    public MarketClosed(String message) {
        super(message);
    }

    public MarketClosed(String message, OperationRejected inner) {
        super(message, inner);
    }
}

package dev.tuxmonteiro.jccxt.base.errors;

public class OnMaintenance extends ExchangeNotAvailable {
    public OnMaintenance() {
        super();
    }

    public OnMaintenance(String message) {
        super(message);
    }

    public OnMaintenance(String message, ExchangeNotAvailable inner) {
        super(message, inner);
    }
}

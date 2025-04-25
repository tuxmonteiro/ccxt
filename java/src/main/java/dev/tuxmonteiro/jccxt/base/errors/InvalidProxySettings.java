package dev.tuxmonteiro.jccxt.base.errors;

public class InvalidProxySettings extends ExchangeError {
    public InvalidProxySettings() {
        super();
    }

    public InvalidProxySettings(String message) {
        super(message);
    }

    public InvalidProxySettings(String message, ExchangeError inner) {
        super(message, inner);
    }
}

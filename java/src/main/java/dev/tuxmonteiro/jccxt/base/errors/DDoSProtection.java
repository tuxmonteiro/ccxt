package dev.tuxmonteiro.jccxt.base.errors;

public class DDoSProtection extends NetworkError {
    public DDoSProtection() {
        super();
    }

    public DDoSProtection(String message) {
        super(message);
    }

    public DDoSProtection(String message, NetworkError inner) {
        super(message, inner);
    }
}

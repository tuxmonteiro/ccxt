package dev.tuxmonteiro.jccxt.base.errors;

public class RateLimitExceeded extends NetworkError {
    public RateLimitExceeded() {
        super();
    }

    public RateLimitExceeded(String message) {
        super(message);
    }

    public RateLimitExceeded(String message, NetworkError inner) {
        super(message, inner);
    }
}

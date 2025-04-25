package dev.tuxmonteiro.jccxt.base.errors;

public class RequestTimeout extends NetworkError {
    public RequestTimeout() {
        super();
    }

    public RequestTimeout(String message) {
        super(message);
    }

    public RequestTimeout(String message, NetworkError inner) {
        super(message, inner);
    }
}

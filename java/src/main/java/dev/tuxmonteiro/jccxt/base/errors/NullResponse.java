package dev.tuxmonteiro.jccxt.base.errors;

public class NullResponse extends BadResponse {
    public NullResponse() {
        super();
    }

    public NullResponse(String message) {
        super(message);
    }

    public NullResponse(String message, BadResponse inner) {
        super(message, inner);
    }
}

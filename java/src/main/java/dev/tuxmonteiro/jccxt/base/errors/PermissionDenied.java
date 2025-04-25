package dev.tuxmonteiro.jccxt.base.errors;

public class PermissionDenied extends AuthenticationError {
    public PermissionDenied() {
        super();
    }

    public PermissionDenied(String message) {
        super(message);
    }

    public PermissionDenied(String message, AuthenticationError inner) {
        super(message, inner);
    }
}

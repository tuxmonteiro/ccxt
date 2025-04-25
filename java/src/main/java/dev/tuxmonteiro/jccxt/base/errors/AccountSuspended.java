package dev.tuxmonteiro.jccxt.base.errors;

public class AccountSuspended extends AuthenticationError {
    public AccountSuspended() {
        super();
    }

    public AccountSuspended(String message) {
        super(message);
    }

    public AccountSuspended(String message, AuthenticationError inner) {
        super(message, inner);
    }
}

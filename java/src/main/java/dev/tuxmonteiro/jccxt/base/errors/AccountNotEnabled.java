package dev.tuxmonteiro.jccxt.base.errors;

public class AccountNotEnabled extends PermissionDenied {
    public AccountNotEnabled() {
        super();
    }

    public AccountNotEnabled(String message) {
        super(message);
    }

    public AccountNotEnabled(String message, PermissionDenied inner) {
        super(message, inner);
    }
}

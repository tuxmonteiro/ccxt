package dev.tuxmonteiro.jccxt.base.errors;

public class AddressPending extends InvalidAddress {
    public AddressPending() {
        super();
    }

    public AddressPending(String message) {
        super(message);
    }

    public AddressPending(String message, InvalidAddress inner) {
        super(message, inner);
    }
}

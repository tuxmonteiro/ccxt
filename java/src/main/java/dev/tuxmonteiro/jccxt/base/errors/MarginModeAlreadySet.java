package dev.tuxmonteiro.jccxt.base.errors;

public class MarginModeAlreadySet extends NoChange {
    public MarginModeAlreadySet() {
        super();
    }

    public MarginModeAlreadySet(String message) {
        super(message);
    }

    public MarginModeAlreadySet(String message, NoChange inner) {
        super(message, inner);
    }
}

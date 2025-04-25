package dev.tuxmonteiro.jccxt.base.errors;

public class ContractUnavailable extends InvalidOrder {
    public ContractUnavailable() {
        super();
    }

    public ContractUnavailable(String message) {
        super(message);
    }

    public ContractUnavailable(String message, InvalidOrder inner) {
        super(message, inner);
    }
}

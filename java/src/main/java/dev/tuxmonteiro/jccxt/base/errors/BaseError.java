package dev.tuxmonteiro.jccxt.base.errors;

import java.lang.RuntimeException;

public class BaseError extends RuntimeException {

    private static final String ERROR_HIERARCHY = """
    {
        'BaseError': {
            'ExchangeError': {
                'AuthenticationError': {
                    'PermissionDenied': {
                        'AccountNotEnabled': {},
                    },
                    'AccountSuspended': {},
                },
                'ArgumentsRequired': {},
                'BadRequest': {
                    'BadSymbol': {},
                },
                'OperationRejected': {
                    'NoChange': {
                        'MarginModeAlreadySet': {},
                    },
                    'MarketClosed': {},
                    'ManualInteractionNeeded': {},
                },
                'InsufficientFunds': {},
                'InvalidAddress': {
                    'AddressPending': {},
                },
                'InvalidOrder': {
                    'OrderNotFound': {},
                    'OrderNotCached': {},
                    'OrderImmediatelyFillable': {},
                    'OrderNotFillable': {},
                    'DuplicateOrderId': {},
                    'ContractUnavailable': {},
                },
                'NotSupported': {},
                'InvalidProxySettings': {},
                'ExchangeClosedByUser': {},
            },
            'OperationFailed': {
                'NetworkError': {
                    'DDoSProtection': {},
                    'RateLimitExceeded': {},
                    'ExchangeNotAvailable': {
                        'OnMaintenance': {},
                    },
                    'InvalidNonce': {
                        'ChecksumError': {},
                    },
                    'RequestTimeout': {},
                },
                'BadResponse': {
                    'NullResponse': {},
                },
                'CancelPending': {},
            },
            'UnsubscribeError': {},
        }
    }
    """;

    public BaseError() {
        super();
    }

    public BaseError(String message) {
        super(message);
    }

    public BaseError(String message, RuntimeException inner) {
        super(message, inner);
    }

    public String getErrorHierarchy() {
        return ERROR_HIERARCHY;
    }
}


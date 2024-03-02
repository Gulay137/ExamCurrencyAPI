package com.example.currencyapi.exceptions;

import lombok.Getter;

@Getter
public class CurrencyExchangeException extends RuntimeException {
    private final String errorCode;

    public CurrencyExchangeException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}

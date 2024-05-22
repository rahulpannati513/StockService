package org.rahul.stockservice.Exceptions;

public class StockNotFoundException extends  RuntimeException {

    public StockNotFoundException(String message) {
        super(message);
    }
}

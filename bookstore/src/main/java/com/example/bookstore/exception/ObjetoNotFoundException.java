package com.example.bookstore.exception;


public class ObjetoNotFoundException extends RuntimeException {

    private static final long serialversionUID = 1L;

    public ObjetoNotFoundException(String message, Throwable cause){
        super(message, cause);

    }
    public ObjetoNotFoundException(String message){
        super(message);
    }

    
}

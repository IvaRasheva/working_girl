package com.task1_SumNumber;

public class EqualNumbsException extends Exception{

    public EqualNumbsException() {
    }

    public EqualNumbsException(String message) {
        super(message);
    }

    public EqualNumbsException(String message, Throwable cause) {
        super(message, cause);
    }
}

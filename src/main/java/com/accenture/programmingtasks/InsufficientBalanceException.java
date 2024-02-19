package com.accenture.programmingtasks;

public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException (String errorMessage){
        super(errorMessage);
    }
}

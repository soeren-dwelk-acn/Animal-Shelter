package com.accenture.programmingtasks;

public class SeatNotAvailableException extends RuntimeException{
    public SeatNotAvailableException(String errorMessage){
        super(errorMessage);
    }
}

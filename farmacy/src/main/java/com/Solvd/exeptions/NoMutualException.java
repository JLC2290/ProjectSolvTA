package com.Solvd.exeptions;

public class NoMutualException extends RuntimeException {
    public NoMutualException(){}

    public NoMutualException(String message){
        super(message);
    }

    public NoMutualException(String message, Throwable cause){ super(message, cause);}

}

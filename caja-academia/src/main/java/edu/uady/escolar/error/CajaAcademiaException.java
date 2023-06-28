package edu.uady.escolar.error;

public class CajaAcademiaException extends Exception{
    private int code;
    private String message;

    public CajaAcademiaException (String message){
        super(message);
    }
}

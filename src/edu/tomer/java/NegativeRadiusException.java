package edu.tomer.java;

/**
 * Created by Tomer on 14/03/2017.
 */
public class NegativeRadiusException extends IllegalArgumentException{

    public NegativeRadiusException() {
    }

    public NegativeRadiusException(String message) {
        super(message);
    }
}

package com.mv.exceptions;

/**
 * Created by Eezo on 13.05.2016.
 */
public class MovieNotFoundException extends Exception {

    public MovieNotFoundException() {
        super();
    }

    public MovieNotFoundException(String message) {
        super(message);
    }

    public MovieNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

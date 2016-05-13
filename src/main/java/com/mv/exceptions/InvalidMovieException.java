package com.mv.exceptions;

/**
 * Created by Eezo on 13.05.2016.
 */
public class InvalidMovieException extends Exception {

    public InvalidMovieException() {
        super();
    }

    public InvalidMovieException(String message) {
        super(message);
    }

    public InvalidMovieException(String message, Throwable cause) {
        super(message, cause);
    }
}

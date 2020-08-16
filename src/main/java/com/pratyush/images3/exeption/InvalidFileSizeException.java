package com.pratyush.images3.exeption;

public class InvalidFileSizeException extends Exception {
    public InvalidFileSizeException() {
        super();
    }

    public InvalidFileSizeException(String message) {
        super(message);
    }

    public InvalidFileSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFileSizeException(Throwable cause) {
        super(cause);
    }
}

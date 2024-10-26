package org.guivic.exceptions;

public class errorIbanException extends Exception {
    public errorIbanException(String message) {
        System.out.println("errorIbanException: " + message);
    }
}

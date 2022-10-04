package com.in28minutes.rest.webservices.restfulwebservices.Exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}

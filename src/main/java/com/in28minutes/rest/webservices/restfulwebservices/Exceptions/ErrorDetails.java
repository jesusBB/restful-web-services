package com.in28minutes.rest.webservices.restfulwebservices.Exceptions;

import java.time.LocalDateTime;

public class ErrorDetails {

    private final LocalDateTime timestamp;
    private final String message;
    private final String details;

    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

}

package org.example.controller;

import org.springframework.http.HttpStatus;

public class CustomHttpException extends RuntimeException {
    private String message;

    public CustomHttpException(String message) {
        this.message = message;
    }
}

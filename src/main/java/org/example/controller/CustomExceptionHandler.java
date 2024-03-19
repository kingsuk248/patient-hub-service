package org.example.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = CustomHttpException.class)
    protected ResponseEntity<Object> handleHttpException(
            RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "HTTP Error";
        return new ResponseEntity<>(bodyOfResponse, HttpStatus.NOT_FOUND);
    }
}

package com.manga.exeption;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class ErrorMessage {
    private HttpStatus statusCode;
    private String message;
    private List<String> errors;

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorMessage(HttpStatus statusCode, String message, List<String> errors) {
        super();
        this.statusCode = statusCode;
        this.message = message;
        this.errors = errors;
    }
    public ErrorMessage(HttpStatus statusCode, String message, String error) {
        super();
        this.statusCode = statusCode;
        this.message = message;
        this.errors = Arrays.asList(error);
    }
}

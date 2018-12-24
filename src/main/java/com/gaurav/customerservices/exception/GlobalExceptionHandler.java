package com.gaurav.customerservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> exceptionHandler(CustomerNotFound exe) {
        CustomerErrorResponse response = new CustomerErrorResponse(HttpStatus.NOT_FOUND.value(), exe.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> exceptionHandler(Exception exe) {
        CustomerErrorResponse response = new CustomerErrorResponse(HttpStatus.BAD_REQUEST.value(), exe.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}

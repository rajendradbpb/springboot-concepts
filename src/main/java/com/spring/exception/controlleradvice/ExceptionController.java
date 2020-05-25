package com.spring.exception.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.spring.exception.InValidCredentialException;

@RestController
@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(InValidCredentialException.class) 
	public ResponseEntity<?> userNotFoundException(final InValidCredentialException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(Exception.class) 
	public ResponseEntity<?> internalServerError(final InValidCredentialException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

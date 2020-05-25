package com.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
	@GetMapping("/default")
	public ResponseEntity<?> getDefaultException(){
		return new ResponseEntity<Exception>(new Exception("Demo default exception"), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/exceptionHandling/responseStatus/classLevel/{username}")
	public String getUserDefinedException(@PathVariable String username) throws InValidCredentialException{
		if(!username.equals("admin"))
			throw new InValidCredentialException("Username or password not valid");
		else
			return "Hello "+username;
	}
	@GetMapping("/exceptionHandling/responseStatus/methodLevel/{username}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public String getUserDefinedExceptionMethodLevel(@PathVariable String username) throws Exception{
		if(!username.equals("admin"))
			throw new Exception("Username or password not valid");
		else
			return "Hello "+username;
	}
}

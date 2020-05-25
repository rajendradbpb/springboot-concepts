package com.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InValidCredentialException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Username or password is valid";
	}

	public InValidCredentialException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}

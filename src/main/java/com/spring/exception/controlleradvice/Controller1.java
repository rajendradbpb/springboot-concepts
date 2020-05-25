package com.spring.exception.controlleradvice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.exception.InValidCredentialException;

@RestController
public class Controller1 {

	@GetMapping("/controllerAdvice/controller1/{username}")
	public String getName(@PathVariable String username) throws InValidCredentialException{
		if(!username.equals("admin")) {
			throw new InValidCredentialException("username "+username+" is not valid");
		}
		return username;
	}
}

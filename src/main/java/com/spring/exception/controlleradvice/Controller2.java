package com.spring.exception.controlleradvice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.exception.InValidCredentialException;

@RestController
public class Controller2 {

	@GetMapping("/controllerAdvice/controller2/{username}")
	public String getName(@PathVariable String username) throws Exception{
		if(!username.equals("admin")) {
			throw new Exception("username "+username+" is not valid");
		}
		return username;
	}
}

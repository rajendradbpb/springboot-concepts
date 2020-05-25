package com.spring.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.exception")
public class ExceptionApp {
	public static void main(String[] args) {
		SpringApplication.run(ExceptionApp.class, args);
	}
}

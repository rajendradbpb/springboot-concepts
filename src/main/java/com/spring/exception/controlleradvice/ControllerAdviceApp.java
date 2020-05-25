package com.spring.exception.controlleradvice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.exception.controlleradvice")
public class ControllerAdviceApp {
	public static void main(String[] args) {
		SpringApplication.run(ControllerAdviceApp.class, args);
	}
}

package com.spring.responseentity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.responseentity")
public class ResponseEntityApp {
	public static void main(String[] args) {
		SpringApplication.run(ResponseEntityApp.class, args);
	}
}

package com.spring.swaggerUI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.swaggerUI")
public class SwaggerUIApp {
	public static void main(String[] args) {
		SpringApplication.run(SwaggerUIApp.class, args);
	}
}

package com.spring.hateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.hateoas")
public class HateoasApp {
	public static void main(String[] args) {
		SpringApplication.run(HateoasApp.class, args);
	}
}

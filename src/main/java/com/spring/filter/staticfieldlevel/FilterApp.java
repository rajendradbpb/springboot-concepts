package com.spring.filter.staticfieldlevel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.filter")
public class FilterApp {
	public static void main(String[] args) {
		SpringApplication.run(FilterApp.class, args);
	}
}

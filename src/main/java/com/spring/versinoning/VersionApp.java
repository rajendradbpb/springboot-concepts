package com.spring.versinoning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.versinoning")
public class VersionApp {

	public static void main(String[] args) {
		SpringApplication.run(VersionApp.class, args);
	}
}

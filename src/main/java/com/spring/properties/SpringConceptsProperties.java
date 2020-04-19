package com.spring.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@EnableConfigurationProperties
@ComponentScan("com.spring.properties")
@SpringBootApplication
public class SpringConceptsProperties {

	public static void main(String[] args) {
		SpringApplication.run(SpringConceptsProperties.class, args);
	}

}

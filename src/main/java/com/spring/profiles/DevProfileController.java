package com.spring.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("dev")

@RequestMapping("/profile")
@RestController
public class DevProfileController {
	@Value("${profile.firstName}")
	private String firstName;
	@Value("${profile.lastName}")
	private String lastName;
	
	@GetMapping("/name")
	public String getProfileName() {
		return "dev";
	}
	@GetMapping("/fullName")
	public String getFullName() {
		return firstName + "  " + lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

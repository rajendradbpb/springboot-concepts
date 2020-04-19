package com.spring.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("accp")
@RequestMapping("/profile")
@RestController
public class AccpProfileController {
	@Value("${profile.firstName}")
	private String firstName;
	@Value("${profile.lastName}")
	private String lastName;
	
	@GetMapping("/name")
	public String getProfileName() {
		return "accp";
	}
	@GetMapping("/fullName")
	public String getFullName() {
		return firstName + "  " + lastName;
	}
}

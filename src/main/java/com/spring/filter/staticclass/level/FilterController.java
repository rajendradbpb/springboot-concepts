package com.spring.filter.staticclass.level;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
public class FilterController {
	@GetMapping("/ok")
	public ResponseEntity<String> getOk() {
		return new ResponseEntity<String>("ok", HttpStatus.OK);
	}
	
	@PostMapping("/created")
	public ResponseEntity<?> created(@RequestBody User user) {
		// saving the user logic skips
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@JsonIgnoreProperties(value = {"password"})
	public static class User{
		private String username;
		private String password;
		private String city;
		

		public User(String username, String password, String city) {
			super();
			this.username = username;
			this.password = password;
			this.city = city;
		}

		public User() {
			super();
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
		
	}
}

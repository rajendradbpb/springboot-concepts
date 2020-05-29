package com.spring.filter.staticfieldlevel;

import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	public static class User{
		private String username;
		
		@JsonIgnore
		private String password;
		public User(String username, String password) {
			super();
			this.username = username;
			this.password = password;
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
		
		
	}
}

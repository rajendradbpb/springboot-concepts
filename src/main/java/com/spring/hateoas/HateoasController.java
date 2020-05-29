package com.spring.hateoas;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HateoasController {

	@GetMapping("/hateoas/getFirstName/{fullName}")
	public EntityModel<User> getFirstName(@PathVariable String fullName) {
		User user = new User(fullName.split(" ")[0],fullName.split(" ")[1]);
		EntityModel<User> model = new EntityModel<>(user);
		 
		WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getFullName());
	 
		model.add(linkTo.withRel("all-users"));
	 
		return model;
		//return fullName.split(" ")[0];
	}
	
	@GetMapping("/hateoas/getFullName")
	public User getFullName() {
		return new User("XXX","YYY");
	}
	
	
	public static class User{
		private String firstName;
		private String lastName;
		public User(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
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
}

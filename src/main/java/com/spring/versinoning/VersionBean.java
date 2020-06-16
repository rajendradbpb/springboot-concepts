package com.spring.versinoning;

public class VersionBean {

	private String name;
	private String email;
	
	public VersionBean(String name) {
		super();
		this.name = name;
	}
	public VersionBean(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

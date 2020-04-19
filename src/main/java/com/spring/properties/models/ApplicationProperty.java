package com.spring.properties.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix="server")
@Component
public class ApplicationProperty {
	
	private String port;

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
}

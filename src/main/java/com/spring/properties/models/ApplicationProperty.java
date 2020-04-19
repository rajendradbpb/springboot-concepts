package com.spring.properties.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix="server")
@Component
public class ApplicationProperty {
	
	private String port;
	
	@Value("${user.defined.value}")
	private String userDefined;

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUserDefined() {
		return userDefined;
	}

	public void setUserDefined(String userDefined) {
		this.userDefined = userDefined;
	}

	@Override
	public String toString() {
		return "ApplicationProperty [port=" + port + ", userDefined=" + userDefined + "]";
	}
	
}

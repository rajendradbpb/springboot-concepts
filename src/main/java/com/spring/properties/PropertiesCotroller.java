package com.spring.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.properties.models.ApplicationProperty;
import com.spring.properties.models.UserDefinedProperties;

@RestController
@RequestMapping("/property")
public class PropertiesCotroller {
	
	@Autowired
	ApplicationProperty applicationProperty;
	
	@Autowired
	UserDefinedProperties userDefinedProperties;
	
	@GetMapping("/application-property")
	public String getApplicationProperty() {
		return applicationProperty.toString();
	}
	@GetMapping("/user-property")
	public String geUserProperty() {
		return userDefinedProperties.getCustom1() +" "+ userDefinedProperties.getCustom2();
	}
}

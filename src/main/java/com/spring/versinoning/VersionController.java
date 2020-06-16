package com.spring.versinoning;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

	@GetMapping("/version/path/1")
	public VersionBean getPath1Version() {
		return new VersionBean("demo1");
	}
	@GetMapping("/version/path/2")
	public VersionBean getPath2Version() {
		return new VersionBean("demo1","demo1@email.com");
	}
	
	
	@GetMapping(value = "/version/param", params = "version=1")
	public VersionBean getParam1Version() {
		return new VersionBean("demo1");
	}
	@GetMapping(value = "/version/param", params = "version=2")
	public VersionBean getParam2Version() {
		return new VersionBean("demo1","demo1@email.com");
	}
	
	
	@GetMapping(value = "/version/headers", headers = "version=1")
	public VersionBean getHeader1Version() {
		return new VersionBean("demo1");
	}
	@GetMapping(value = "/version/headers", headers = "version=2")
	public VersionBean getHeader2Version() {
		return new VersionBean("demo1","demo1@email.com");
	}
	
	
}

package com.spring.filter.dynamic;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class DynamicFilterController {

	@GetMapping("/filter/noFilter")
	public DynamicFilterBean getNoFilter() {
		
		return  new DynamicFilterBean("demo1", "demo1","demo1");
	}
	@GetMapping("/filter/filter1")
	public MappingJacksonValue getFilter1() {
//		SimpleFilterProvider simpleFilterProvider = new SimpleFilterProvider();
//		simpleFilterProvider.addFilter("filter1", SimpleBeanPropertyFilter.filterOutAllExcept("f2", "f3"));
//		FilterProvider filterProvider= simpleFilterProvider;
//		return  filterProvider;
		
		DynamicFilterBean bean = new DynamicFilterBean("demo1", "demo1","demo1");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("f1");
		FilterProvider filterProvider= new SimpleFilterProvider().addFilter("filter1", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(bean);
		mapping.setFilters(filterProvider);
		return mapping;
		
	}
	@GetMapping("/filter/filter2")
	public DynamicFilterBean getFilter2() {
		// yet to be implemented for applying multiple filter with same bean class
		return  new DynamicFilterBean("demo1", "demo1","demo1");
	}
}

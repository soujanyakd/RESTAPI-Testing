package com.restapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.restapi.apirequests.APIRequests;

@Configuration
@ComponentScan(basePackages = {"com"})
@PropertySource("file:../RestAPITesting/apiconfig.properties")
public class ConfigureProperty {
	
	@Bean
	public ManageProperty manageProperty() {
		return new ManageProperty();
	}
	
	@Bean
	public APIRequests getRequest() {
		return new APIRequests();
	}

}

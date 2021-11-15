package com.restapi.testcase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.restapi.apirequests.APIRequests;
import com.restapi.configuration.ConfigureProperty;
import com.restapi.configuration.ManageProperty;

public class Base extends AbstractTestNGSpringContextTests {
	
	static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigureProperty.class);
	static ManageProperty configure = context.getBean(ManageProperty.class);
	APIRequests apiRequest =  context.getBean(APIRequests.class);

}

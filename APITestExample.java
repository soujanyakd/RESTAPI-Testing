package com.restapi.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APITestExample extends Base{
	
	@BeforeClass
    public static void setup() {
        RestAssured.baseURI = configure.getBaseUrl(); 
    }
	
	@Test
	public void apiTestCase() {
		apiRequest.assertion(apiRequest.getRequest(), 200);
		apiRequest.assertion(apiRequest.postRequest(configure.getRequestBody().toString()), 201);
		apiRequest.assertion(apiRequest.putRequest(configure.getRequestBody().toString()), 200);
		apiRequest.assertion(apiRequest.deleteRequest(), 200);
	}
}

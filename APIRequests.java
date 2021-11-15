package com.restapi.apirequests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIRequests extends Constants{

	public int getRequest() {
		Response response = given().contentType(ContentType.JSON).when().get(APIURL_POSTS).then().extract().response();
		return response.statusCode();
	}

	public int postRequest(String requestBody) {
		Response response = given().contentType(ContentType.JSON).body(requestBody).when().post(APIURL_POSTS).then()
				.extract().response();
		System.out.println(response.getBody().asString());
		return response.statusCode();
	}

	public int putRequest(String requestBody) {
		Response response = given().contentType(ContentType.JSON).body(requestBody).when().put(APIURL_POSTSID).then()
				.extract().response();
		System.out.println(response.getBody().asString());
		return response.statusCode();
	}

	public int deleteRequest() {
		Response response = given().contentType(ContentType.JSON).when().delete(APIURL_POSTSID).then().extract().response();
		return response.statusCode();
	}
	

	public void assertion(int actualStatusCode , int expectedStatusCode) {
		Assert.assertEquals(actualStatusCode, expectedStatusCode);
	}

}

package com.restapi.configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ManageProperty {
	
	private String title;
	private String Body;
	private String userId;
	
	@Value("${api.baseurl}")
    private String baseUrl;
	
	public JSONObject getRequestBody() {
		JSONParser parser = new JSONParser();
	    JSONObject data = null;
		try {
			data = (JSONObject) parser.parse(new FileReader("../RestAPITesting/RequestBody.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	    return data;
		
	}
	
	
	/*
	 * @SuppressWarnings("unchecked") public String getPostRequestBody() {
	 * JSONObject postRequestBody = new JSONObject(); postRequestBody.put("title",
	 * "Java"); postRequestBody.put("Body", "Programming Language");
	 * postRequestBody.put("userId", "1"); return postRequestBody.toJSONString(); }
	 * 
	 * @SuppressWarnings("unchecked") public String getPutRequestBody() { JSONObject
	 * putRequestBody = new JSONObject(); putRequestBody.put("title", "Java");
	 * putRequestBody.put("Body", "Platform Independent Programming Language");
	 * putRequestBody.put("userId", "1"); return putRequestBody.toJSONString(); }
	 */
}

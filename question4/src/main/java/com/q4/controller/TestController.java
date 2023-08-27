package com.q4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/test")
	public String getResponse()
	{
		String url = "http://127.0.0.1:8999/test?value=p";
		
		String ans = restTemplate.getForObject(url, String.class);
		return ans;
	}
	
}

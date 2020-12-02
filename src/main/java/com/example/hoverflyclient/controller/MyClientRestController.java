package com.example.hoverflyclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class MyClientRestController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/invoke")
	public String invoke() {
		
		System.out.println("inside Test Controller::invoke()");
		
		String url="http://localhost:9080/service/hoverfly";
		
		//String response = restTemplate.
		
	}

}

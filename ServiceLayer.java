package com.test.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.test.entity.Country;

@Service
public class ServiceLayer {
	
	private final RestTemplate restTemplate;
	
	// constructor
	public ServiceLayer(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public Country[] consumeApi() {
		return restTemplate.getForObject("https://cloudfinch-public.s3.ap-south-1.amazonaws.com/countries.json", Country[].class);
	}
}
package com.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.entity.Country;
import com.test.service.ServiceLayer;

@RestController
public class HomeController {

	private final ServiceLayer serviceLayer;
	
	// constructor
	public HomeController(ServiceLayer serviceLayer) {
		this.serviceLayer = serviceLayer;
	}
	
	// Rest API 
	@GetMapping("/countries")
	public ResponseEntity<Country[]> getData() {
		return new ResponseEntity<>(serviceLayer.consumeApi(), HttpStatus.OK);
	}
}
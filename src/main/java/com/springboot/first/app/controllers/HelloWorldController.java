package com.springboot.first.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	// GET HTTP Method
	// http://localhost:8080/hello-world
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello";
	}

}

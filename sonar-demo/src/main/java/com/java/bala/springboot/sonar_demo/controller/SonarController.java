package com.java.bala.springboot.sonar_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SonarController {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World";
	}

}

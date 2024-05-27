package com.prowings.helloWorldservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWOrldController {

	@GetMapping("/hello")
	public String getHello() {
		return "Hello Java Develpers..... Welcome to Microservices retry Design Patterns. ";
	}
}

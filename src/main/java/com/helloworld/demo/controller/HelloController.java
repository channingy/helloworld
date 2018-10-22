package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/test/{name}")
	public String testName(@PathVariable String name) {
	    return "This is Spring Boot Project. Hello " + name;
	}
}

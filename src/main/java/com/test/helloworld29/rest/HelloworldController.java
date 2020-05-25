package com.test.helloworld29.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@GetMapping("/msg")
	public String getMessage() {
		return "hello world";
	}
}

package com.hana.hackathon.turkey.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping
	public String testGetRequest() {
		return react("GET");
	}

	@PostMapping
	public String testPostRequest() {
		return react("POST");
	}

	private String react(String s) {
		System.out.println("called " + s + " method");
		return s + " OK";
	}
}
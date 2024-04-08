package com.example.demo;


import  org.springframework.web.bind.annotation.*;
@RestController
public class Hello {
	
	@GetMapping("/hello")
	public String sayhi(@RequestParam(required = false, defaultValue = "Welcome to") String param) {
		return "hello"+param+"................";
	}

}

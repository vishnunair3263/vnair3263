package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {
	
	
	
	@RequestMapping("/getData")
	private String getData(@RequestParam("i") int i) {
		System.out.print("i");
		return "Hello world";

	}

}

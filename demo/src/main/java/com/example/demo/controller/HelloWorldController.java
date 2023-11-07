package com.example.demo.controller;

import com.example.demo.dto.Root;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class HelloWorldController {
	
	@GetMapping
	public Root get() {
		Root root1 = null;
		return root1;
	}

	
	@PostMapping
	public Root save() {
		Root root = null;
		return root;
	}
}

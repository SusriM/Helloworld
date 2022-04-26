package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Environment;
import com.example.demo.dto.Root;

@RestController
@RequestMapping("/")
class HelloWorldController {
	
	@GetMapping
	public Root get() {
		Root root = null;
		return root;
	}

	
	@PostMapping
	public Root save() {
		Root root = null;
		return root;
	}
}

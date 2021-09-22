package com.marlabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/student/{id}")
	public String getStudent(@PathVariable("id") Integer id) {
		return "Student id is "+id;
	}
}

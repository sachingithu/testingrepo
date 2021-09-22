package com.marlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.model.ApiResponse;
import com.marlabs.model.User;
import com.marlabs.model.UserDTO;
import com.marlabs.service.UserService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ApiResponse<User>saveUser(@RequestBody UserDTO user) {
		return new ApiResponse<>(HttpStatus.OK.value(),"USer Saved Successfully.....",userService.save(user));
	
	}
}

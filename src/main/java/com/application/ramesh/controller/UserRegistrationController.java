package com.application.ramesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.ramesh.entity.UserMaster;
import com.application.ramesh.service.UserService;

@RestController
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/v1/register-new-user")
	public ResponseEntity<?> registerUser(@RequestBody UserMaster user){
	
		userService.registerUser(user);
		return null;
		
	}
	
	@GetMapping("/test")
	public String test() {
		return "hello";
	}
}

package com.q9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.q9.model.User;
import com.q9.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public String addUserHandler(@RequestBody User user)
	{
		String result = userService.addCustomer(user);
		return "redirect:/login"; 
        
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<String> validateUserHandler(@RequestBody User user)
	{
		return new ResponseEntity<>(userService.validateUser(user.getUserName(), user.getPassword()),HttpStatus.OK);
	}
	
	

}

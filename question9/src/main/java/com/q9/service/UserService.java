package com.q9.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.q9.model.User;

@Service
public class UserService {

	
	Map<String , String> customerMap = new HashMap<>();
	
	
	public String addCustomer(@RequestBody User user)
	{
		if(customerMap.containsKey(user.getUserName()))
		{
			return "Username unavailable choose a different username";
		}
		customerMap.put(user.getUserName(), user.getPassword());
		
		return "Customer Signed up sucessfully";	
	}
	
	
	public String validateUser(String username, String password)
	{
		if(customerMap.containsKey(username))
		{
			if(customerMap.get(username)==password)
			{
				return "User signed in sucessfully";
			}
			
			else
			{
				return "Incorrect password";
			}
		
		}
		
		return "Invalid username";
	}
	
	
	
}

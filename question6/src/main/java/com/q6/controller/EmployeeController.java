package com.q6.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.q6.model.Employee;
import com.q6.repository.EmployeeRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee()
	{
		List<Employee> empList = new ArrayList<>();
		empList =  empRepo.findAll();
		return new ResponseEntity<>(empList,HttpStatus.OK);
	}
}

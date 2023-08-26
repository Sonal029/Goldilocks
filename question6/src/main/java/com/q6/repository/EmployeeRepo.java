package com.q6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.q6.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	
}

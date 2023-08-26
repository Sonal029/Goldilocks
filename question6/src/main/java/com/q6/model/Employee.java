package com.q6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="test")
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private Integer age;
	
	
}

package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("emp")
@ComponentScan(basePackages="com")
public class EmployeeDetails {
	
	public EmployeeDetails() {
		System.out.println("Object created");
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee name: ABC");
		System.out.println("Employee salary: 650000");
	}
}
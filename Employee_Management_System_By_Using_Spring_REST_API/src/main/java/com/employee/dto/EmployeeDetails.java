package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
//@Setter
//@Getter
//@ToString
@Data
public class EmployeeDetails {
	
	
	private String employeename;
	private double employeesalary;
	private int employeedeptno;
	private long mobilenumber;
	private String email;
	private String gender;

}

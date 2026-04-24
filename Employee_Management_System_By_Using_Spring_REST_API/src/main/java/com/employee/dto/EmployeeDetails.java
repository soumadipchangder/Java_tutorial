package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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

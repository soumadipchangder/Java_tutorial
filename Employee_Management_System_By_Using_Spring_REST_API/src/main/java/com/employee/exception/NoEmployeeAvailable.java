package com.employee.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class NoEmployeeAvailable extends RuntimeException{
	
	@Getter
	private String exceptionmsg;
}

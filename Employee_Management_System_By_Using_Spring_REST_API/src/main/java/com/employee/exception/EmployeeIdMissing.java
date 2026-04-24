package com.employee.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EmployeeIdMissing extends RuntimeException {

	private String exceptionmsg;
}

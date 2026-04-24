package com.employee.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class InvalidCredentials extends RuntimeException {
	@Getter
	private String exceptionmsg;
}

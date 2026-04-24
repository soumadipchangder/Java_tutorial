package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<?> duplicateEmailExceptionHandler(DuplicateEmailException ex) {
		return new ResponseEntity<>(ex.getExceptionmsg(), HttpStatus.CONFLICT);
	}
    @ExceptionHandler(DuplicateMobileNumberException.class)
	public ResponseEntity<?> duplicateMobileNumberExceptionHandler(DuplicateMobileNumberException ex) {
		return new ResponseEntity<>(ex.getExceptionmsg(), HttpStatus.CONFLICT);
	}
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<?> InvalidCredentialsHandler(InvalidCredentials ex) {
    	return new ResponseEntity<>(ex.getExceptionmsg(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NoEmployeeAvailable.class)
    public ResponseEntity<?> noEmployeeAvailableHandler(NoEmployeeAvailable ex) {
    	return new ResponseEntity<>(ex.getExceptionmsg(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(NoEmployeesDeleted.class)
    public ResponseEntity<?> noEmployeesDeletedHandler(NoEmployeesDeleted ex) {
    	return new ResponseEntity<>(ex.getExceptionmsg(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(EmployeeIdMissing.class)
    public ResponseEntity<?> employeeIdMissingHandler(EmployeeIdMissing ex) {
    	return new ResponseEntity<>(ex.getExceptionmsg(), HttpStatus.BAD_REQUEST);
    }
    
}
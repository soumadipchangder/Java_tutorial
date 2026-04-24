package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.DAO.EmployeeDAO;
import com.employee.dto.EmployeeDetails;
import com.employee.entity.EmployeeDetailsEntity;
import com.employee.exception.*;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	public ResponseEntity<?> employeeRegistration(EmployeeDetails employeeDetails) {
		
		List<EmployeeDetailsEntity> allEmployeeDetails = employeeDAO.getAllEmployeeDetails();
		
		String email = employeeDetails.getEmail();
		long mobilenumber = employeeDetails.getMobilenumber();
		
		long emailcount = allEmployeeDetails.stream()
				.filter(employee -> employee.getEmail().equalsIgnoreCase(email))
				.count();
		
		if (emailcount > 0) {
			throw new DuplicateEmailException("Email already exists...");
		}
		
		long mobilenumbercount = allEmployeeDetails.stream()
				.filter(employee -> employee.getMobilenumber() == mobilenumber)
				.count();
		
		if (mobilenumbercount > 0) {
			throw new DuplicateMobileNumberException("Mobile number already exists...");
		}
		
		EmployeeDetailsEntity employeeDetailsEntity = new EmployeeDetailsEntity();
		
		employeeDetailsEntity.setEmployeename(employeeDetails.getEmployeename());
		employeeDetailsEntity.setEmail(employeeDetails.getEmail());
		employeeDetailsEntity.setEmployeedeptno(employeeDetails.getEmployeedeptno());
		employeeDetailsEntity.setEmployeesalary(employeeDetails.getEmployeesalary());
		employeeDetailsEntity.setGender(employeeDetails.getGender());
		employeeDetailsEntity.setMobilenumber(employeeDetails.getMobilenumber());
		
		employeeDAO.insertEmployeeDetails(employeeDetailsEntity);
		return new ResponseEntity<>("Employee Registered Successfully", HttpStatus.CREATED);
	}
	
	//service
	
	public ResponseEntity<?> employeelogin(String email,long mobilenumber) {
		EmployeeDetailsEntity employeeDetailsEntity=
				employeeDAO.getEmployeeDetailsBYUsingEmailAndMobilenumber(email,mobilenumber);
		if (employeeDetailsEntity!=null) {
			return new ResponseEntity<>("Login Successful.......",HttpStatus.FOUND);
		} else {
			throw new InvalidCredentials("Invalid Credentials");
		}
	}
	
	public ResponseEntity<?> allEmployeeDetails() {
		List<EmployeeDetailsEntity> allEmployeeDetails=employeeDAO.getAllEmployeeDetails();
		if(allEmployeeDetails!=null) {
			return new ResponseEntity<>(allEmployeeDetails, HttpStatus.OK);
		} else {
			throw new NoEmployeeAvailable("No Data Available.......");
		}
	}
	
	public ResponseEntity<?> removeEmployeeByUsingEmail(String email) {
		long result=employeeDAO.deleteEmployeeByUsingEmail(email);
		if(result!=0) {
			return new ResponseEntity<>("Employee Deleted Successfully", HttpStatus.OK);
		} else {
			throw new NoEmployeesDeleted("Emailid not found.......");
		}
	}

	public ResponseEntity<?> updateEmployeeSalaryByUsingMobileNumber(double salary, long mobile) {
	    long result = employeeDAO.updateEmployeeSalaryByUsingMobileNumber(salary, mobile);
	    
	    if(result != 0) {
	        return new ResponseEntity<>("Salary Updated Successfully. Rows affected: " + result, HttpStatus.OK);
	    } else {
	        throw new NoEmployeesDeleted("Mobile number not found.......");
	    }
	}
	
	public ResponseEntity<?> getEmployeeDetailsByEmpId(int empId) {
		EmployeeDetailsEntity employeeDetailsEntity = employeeDAO.getEmployeeDetailsByUsingEmpid(empId);
		if (employeeDetailsEntity != null) {
			return new ResponseEntity<>(employeeDetailsEntity, HttpStatus.OK);
		} else {
			throw new NoEmployeeAvailable("No Employee Found With ID: " + empId);
		}
	}
}
package com.employee.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeDetailsEntity;
import com.employee.repository.EmployeeRepository;
@Repository
public class EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*In this class we need to Insert Update Delete select in the Employee Table*/
	
	public void insertEmployeeDetails(EmployeeDetailsEntity employeeDetailsEntity){
		
		EmployeeDetailsEntity emDetailsEntity=
				employeeRepository.save(employeeDetailsEntity);
		
	}
	
	public List<EmployeeDetailsEntity> getAllEmployeeDetails() {
		//select
		return employeeRepository.findAll();
		
	}
	public EmployeeDetailsEntity getEmployeeDetailsBYUsingEmailAndMobilenumber(String emailid,long mobilenumber) {
		//select
		return employeeRepository.findByEmailAndMobilenumber(emailid, mobilenumber);
	}
	
	public long deleteEmployeeByUsingEmail(String email) {
		//delete
		return employeeRepository.removeByEmail(email);
	}
	
	public long updateEmployeeSalaryByUsingMobileNumber(double salary,long mobilenumber) {
		//update
		return employeeRepository.updateSalaryByUsingMobileNumber(salary,mobilenumber);
	}
	public EmployeeDetailsEntity getEmployeeDetailsByUsingEmpid(int emp_id) {
		Optional<EmployeeDetailsEntity> optional = employeeRepository.findById(emp_id);
		return optional.orElse(null);
	}

}

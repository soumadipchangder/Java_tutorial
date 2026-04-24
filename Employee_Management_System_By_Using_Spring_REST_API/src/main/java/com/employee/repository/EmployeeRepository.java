package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.employee.entity.EmployeeDetailsEntity;

import jakarta.websocket.server.PathParam;

public interface EmployeeRepository extends JpaRepository<EmployeeDetailsEntity, Integer> {
	
	EmployeeDetailsEntity findByEmailAndMobilenumber(String email,long mobilenumber);
	
	@Transactional
	long removeByEmail(String email);
	
	@Transactional
	@Modifying
	@Query("update EmployeeDetailsEntity e set e.employeesalary = :salary where e.mobilenumber = :mobilenumber")
	int updateSalaryByUsingMobileNumber(@PathParam("salary") double salary, @PathParam("mobilenumber") long mobilenumber);

}

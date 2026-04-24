package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.employee.dto.EmployeeDetails;
import com.employee.service.EmployeeService;

/* It is the class level annotation
 * It is the combination of @Component annotation 
 * It is used to specify the class is used to handle the request and response 
 * It is also used to create bean for controller classes */
//@Controller
//@ResponseBody

/*@RestController is the combination of @Controller and @ResponseBody annotation
 * -> It is used to specify the class is used to handle the request and response
 * -> It is also used  to convert Java Object into JSON (Java Object Script Notation) Object
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	/* PostMapping is used to create an API or end point to handle the HTTP POST 
	 * request or Insert request
	 */
	@PostMapping("/registration")
	public ResponseEntity<?> employeeRegistration(@RequestBody EmployeeDetails employeeDetails) {
		return employeeService.employeeRegistration(employeeDetails);
	}
	
	/* GetMapping is used to create an API or end point to handle the HTTP GET 
	 * request or Fetch request (used for retrieving data like login validation)
	 * 
	 * url
	 * 1) Query String
	 * 2) PathParam
	 * abc@gmail.com
	 * 1234
	 * Query String:-
	 * localhost:8080/emplogin?emailid=abc@gmail.com&password=1234
	 * 
	 * 
	 * The data that is sent to a method handling an HTTP GET request can be passed
	 * through the URL in two ways: 1)Query String 2)URL Path(PathParam).
	 * 
	 * If the data is sent through a Query String, it is added after the API or endpoint using
	 * a question mark(?). The data is stored in key-value pairs.
	 * Syntax:-
	 * http://localhost:8080/emplogin?emailid=abc@gmail.com&password=1234
	 * Here:
	 * Key -> email
	 * value -> abc@gmail.com
	 * 
	 * key -> password
	 * value -> 1234
	 * To retrieve values from the Query String in Spring Boot, we use the @RequestParam annotation.
	 * 
	 * @RequestParam is applied to method parameters.
	 * 
	 */
	@GetMapping("/emplogin")
	public ResponseEntity<?> employeeLoginByUsingemailidAndPassword(
			@RequestParam("emailid")String emailid,
			@RequestParam("mobilenumber")long mb) {
		
		return employeeService.employeelogin(emailid, mb);
	}
	
	/* @PutMapping is used to create an API or end point to handle the HTTP PUT 
	 * request or Update request (used for updating existing data)
	 */
	@PutMapping("/updatesalary/{salary}/{mobile}")
	public ResponseEntity<?> updateEmployeeSalaryByUsingMobileNumber(
	        @PathVariable("salary") double salary,
	        @PathVariable("mobile") long mobile) {
	    
	    return employeeService.updateEmployeeSalaryByUsingMobileNumber(salary, mobile);
	}
	
	/* Query String 
	 * PathParam or Path Variable
	 * localhost:8080/deleteemployee/abc@gmail.com
	 * /* Path Variable (Path Parameter)
	 * Example:
	 * localhost:8080/deleteemployee/abc@gmail.com
	 *
	 * The data that is sent to a method handling an HTTP DELETE request can also be
	 * passed through the URL path itself.
	 *
	 * This is called a Path Parameter (or Path Variable).
	 *
	 * In this case, the value is sent as part of the URL pattern instead of using a key
	 * and value pair or query string.
	 *
	 * Syntax:
	 * https://localhost:8080/deleteemployee/ding@gmail.com
	 * Here: Path Variable -> dinga@gmail.com
	 *
	 * To retrieve values from the URL path in Spring Boot, we use the @PathVariable annotation.
	 *
	 * @PathVariable is applied to method parameters.
	 *
	 * @DeleteMapping is used to create an API or end point to handle the HTTP DELETE
	 * request (Delete operation).
	 */
	@DeleteMapping("/deleteemployee/{emailid}")
	public ResponseEntity<?> deleteEmployeeByEmailAndPassword(@PathVariable ("emailid") String emailid) {
	    return employeeService.removeEmployeeByUsingEmail(emailid);
	}
	
	/* GetMapping is used to create an API or end point to handle the HTTP GET 
	 * request or Fetch request (used for retrieving all records)
	 */
	@GetMapping("/getallemployees")
	public ResponseEntity<?> getAllEmployeeDetails() {
		return employeeService.allEmployeeDetails();
	}
	
	/* GetMapping is used to create an API or end point to handle the HTTP GET 
	 * request or Fetch request (used for retrieving a single employee by ID)
	 * 
	 * Path Variable (Path Parameter)
	 * Example:
	 * localhost:8080/getemployee/1
	 *
	 * The employee ID is passed as part of the URL path.
	 * To retrieve the value from the URL path in Spring Boot, we use the @PathVariable annotation.
	 */
	@GetMapping("/getemployee/{empid}")
	public ResponseEntity<?> getEmployeeDetailsByEmpId(@PathVariable("empid") int empid) {
		return employeeService.getEmployeeDetailsByEmpId(empid);
	}

}
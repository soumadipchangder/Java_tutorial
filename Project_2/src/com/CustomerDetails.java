package com;
import org.MyAPIs;
public class CustomerDetails {
	private int id;
	private String name;
	private long mobilenumber;
	private String emailid;
	
	public void validateMobileNumber(long mobilenumber) {
		
		MyAPIs myApis =new MyAPIs();
		int length=myApis.findThelengthOfTheNumber(mobilenumber);
		if(length==10) {
			System.out.println("valid mobile number");
			this.mobilenumber=mobilenumber;
		}else {
			System.out.println("invalid mobile number");
		}
	}
	public void validateEmail(String email) {
		
		MyAPIs myApis = new MyAPIs();
		
		if(myApis.validateEmail(email)) {
			System.out.println("Valid email");
			this.emailid = email;
		} else {
			System.out.println("Invalid email");
		}
	}
	public static void main(String[] args) {
		CustomerDetails customerdetails = new CustomerDetails();
		customerdetails.validateMobileNumber(7908681475l);
		customerdetails.validateEmail("soumyadip@gmail.com");
	}
}

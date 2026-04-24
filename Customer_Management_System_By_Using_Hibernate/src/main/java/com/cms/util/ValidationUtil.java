package com.cms.util;

public class ValidationUtil {

	public static boolean emailValid(String email){
	    return email.endsWith("@gmail.com");
	}

	public static boolean mobileValid(String mobile){
	    return mobile.matches("[6-9][0-9]{9}");
	}

	public static boolean passwordValid(String password){
	    String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{4}$";
	    return password.matches(regex);
	}

}
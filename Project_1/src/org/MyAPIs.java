package org;

public class MyAPIs {
	
	public int findThelengthOfTheNumber(long number) {
		int length=0;
		while(number!=0) {
			length++;
			number /=10;
		}
		
		return length;
	}
	public boolean validateEmail(String email) {
		
		if(email == null) {
			return false;
		}
		if(email.endsWith("@gmail.com")) {
			return true;
		}
		
		return false;
	}
	

}

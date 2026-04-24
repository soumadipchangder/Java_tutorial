package org;

public class MyAPIs {

    public int findThelengthOfTheNumber(long number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}

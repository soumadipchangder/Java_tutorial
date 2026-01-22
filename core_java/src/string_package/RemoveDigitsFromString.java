package string_package;

import java.util.Scanner;

public class RemoveDigitsFromString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeDigits(input);

        System.out.println("String after removing digits: " + result);
        sc.close();
    }

    public static String removeDigits(String str) {

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {   // not a digit
                newStr = newStr + ch;
            }
        }
        return newStr;
        
    }
    
}


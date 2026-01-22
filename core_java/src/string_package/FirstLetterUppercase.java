package string_package;

import java.util.Scanner;

public class FirstLetterUppercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = toTitleCase(input);

        System.out.println("After conversion: " + result);
        sc.close();
    }

    public static String toTitleCase(String str) {

        String result = "";
        boolean makeUpper = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                result += ch;
                makeUpper = true;
            } else {
                if (makeUpper) {
                    result += Character.toUpperCase(ch);
                    makeUpper = false;
                } else {
                    result += ch;
                }
            }
        }
        return result;
    }
}


package assignment_string;

public class PrintSpecialSymbols {

    public static void main(String[] args) {

        String s = "Hello@#2024!";

        System.out.print("Special Symbols: ");

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                System.out.print(ch + " ");
            }
        }
    }
}

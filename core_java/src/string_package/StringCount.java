package string_package;

public class StringCount {

    public static void main(String[] args) {

        String s = "abcd1234@#ef";

        int alpha = countAlphabets(s);
        int digits = countDigits(s);
        int special = countSpecial(s);

        System.out.println("Alphabets = " + alpha);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
    }

    // ✅ Method to count alphabets
    public static int countAlphabets(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                count++;
            }
        }
        return count;
    }

    // ✅ Method to count digits
    public static int countDigits(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        return count;
    }

    // ✅ Method to count special characters
    public static int countSpecial(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') ||
                  (ch >= 'a' && ch <= 'z') ||
                  (ch >= '0' && ch <= '9'))) {
                count++;
            }
        }
        return count;
    }
}

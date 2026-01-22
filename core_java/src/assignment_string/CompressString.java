package assignment_string;

public class CompressString {

    public static void main(String[] args) {

        String s = "aaabbccc";
        String result = "";

        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result = result + s.charAt(i) + count;
                count = 1;
            }
        }

        // for last character group
        result = result + s.charAt(s.length() - 1) + count;

        System.out.println("Compressed String: " + result);
    }
}

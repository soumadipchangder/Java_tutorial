package string_package;

public class ChangeCase {

    public static void main(String[] args) {

        String a = "xY12z";
        String b = "ABC";

        System.out.print("Toggle a: ");
        toggleCase(a);

        System.out.print("Toggle b: ");
        toggleCase(b);
    }

    public static void toggleCase(String s) {

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            System.out.print(ch);
        }
        System.out.println();
    }
}

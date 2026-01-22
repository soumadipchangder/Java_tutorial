package assignment_string;

public class Common_Char {
    public static void main(String[] args) {

        String s1 = "apple";
        String s2 = "grape";

        System.out.print("Common characters: ");

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (s2.indexOf(c) != -1) {

                if (s1.indexOf(c) == i) {
                    System.out.print(c + " ");
                }
            }
        }
    }
}


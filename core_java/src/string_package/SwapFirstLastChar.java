package string_package;

public class SwapFirstLastChar {

    public static void main(String[] args) {

        String s = "HELLO WORLD JAVA";

        String[] words = s.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {

            String w = words[i];

            if (w.length() == 1) {
                result = result + w + " ";
                continue;
            }

            char first = w.charAt(0);
            char last = w.charAt(w.length() - 1);

            String middle = w.substring(1, w.length() - 1);

            String newWord = last + middle + first;

            result = result + newWord + " ";
        }

        System.out.println(result.trim());
    }
}

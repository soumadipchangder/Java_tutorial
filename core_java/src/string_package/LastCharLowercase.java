package string_package;

public class LastCharLowercase {

    public static void main(String[] args) {

        String s = "HELLO WORLD JAVA";

        String[] words = s.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {

            String w = words[i];

            int lastIndex = w.length() - 1;

            String firstPart = w.substring(0, lastIndex);
            
            char lastChar = w.charAt(lastIndex);

            lastChar = Character.toLowerCase(lastChar);

            result = result + firstPart + lastChar + " ";
        }

        System.out.println(result.trim());
    }
}

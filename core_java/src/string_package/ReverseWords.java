package string_package;

public class ReverseWords {

    public static void main(String[] args) {

        String s = "i am student";

        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

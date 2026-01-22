package assignment_string;

public class MaxVowelWord {

    public static void main(String[] args) {

        String s = "i love programming";
        String[] words = s.split(" ");

        int maxVowels = 0;
        String maxWord = "";

        for (int i = 0; i < words.length; i++) {

            String w = words[i];
            int count = 0;

            for (int j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);

                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                    count++;
                }
            }

            if (count > maxVowels) {
                maxVowels = count;
                maxWord = w;
            }
        }

        System.out.println("Word with maximum vowels: " + maxWord);
        System.out.println("Vowel count: " + maxVowels);
    }
}

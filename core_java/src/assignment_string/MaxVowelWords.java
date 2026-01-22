package assignment_string;

public class MaxVowelWords {

    public static void main(String[] args) {

        String s = "i am learning programming";
        String[] words = s.split(" ");

        int maxVowels = 0;

        // Step 1: find max vowel count
        for (String w : words) {
            int count = 0;
            for (int j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);
                if ("aeiouAEIOU".indexOf(ch) != -1)
                    count++;
            }
            if (count > maxVowels)
                maxVowels = count;
        }

        // Step 2: print all words with max vowels
        System.out.println("Maximum vowel count: " + maxVowels);
        System.out.print("Words: ");

        for (String w : words) {
            int count = 0;
            for (int j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);
                if ("aeiouAEIOU".indexOf(ch) != -1)
                    count++;
            }
            if (count == maxVowels)
                System.out.print(w + " ");
        }
    }
}

package practice;

import java.util.*;

public class Smallest_substring_contain_allChar {

    public static String func(String s, String t) {
        if (s.length() < t.length()) return "";
        // s = "A" and t = "ABC"

        int mini = Integer.MAX_VALUE;
        int left = 0;
        int count = t.length(); // 3 'ABC'
        int start = 0;

        Map<Character, Integer> freq = new HashMap<>();
        // string = "ADOBECODEBANC"
        //{'A' : 2,'D' : 2 .......}

        for (char ch : t.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        /* freq = {}
         * for val in s:
         * freq[val] = freq.get(val,0) + 1
         * 
         */
       
        for (int right = 0; right < s.length(); right++) {
        	// string = "ADOBECODEBANC"
        	//first char = "a" t = 'a'
            char ch = s.charAt(right);

            if (freq.containsKey(ch)) {
                if (freq.get(ch) > 0) {
                    count--; //2
                }
                freq.put(ch, freq.get(ch) - 1);
            }

            // Shrink window when valid
            // string == t right - left + 1 < mini
            while (count == 0) {
                if (right - left + 1 < mini) {
                    mini = right - left + 1;
                    start = left;
                }
                //right pointer shifting
                //
                // s = "ADOBECODEBANC"
                char leftChar = s.charAt(left);
                if (freq.containsKey(leftChar)) {
                    freq.put(leftChar, freq.get(leftChar) + 1);
                    if (freq.get(leftChar) > 0) {
                        count++;
                    }
                }
                left++; // backtracking
            }
        }

        return mini == Integer.MAX_VALUE ? "No window found"
                                         : s.substring(start, start + mini);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println("Smallest window: " + func(s, t));
    }
}

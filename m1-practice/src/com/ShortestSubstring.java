package com;

import java.util.*;

public class ShortestSubstring {

    public static int findShortestSubstring(String s) {
        int n = s.length();
        int ans = n;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                String remaining = s.substring(0, i) + s.substring(j + 1);
                
                if (allDistinct(remaining)) {
                    ans = Math.min(ans, j - i + 1);
                }
            }
        }

        return ans == n ? 0 : ans;
    }

    static boolean allDistinct(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c))
                return false;
            set.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abebbc";
        System.out.println(findShortestSubstring(s));
    }
}

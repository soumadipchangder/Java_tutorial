package com;

import java.util.*;

public class SpecialWords {

    static boolean isVowel(char c){

        return "aeiou".indexOf(c) != -1;
    }

    static boolean special(String word){

        return isVowel(word.charAt(0)) && isVowel(word.charAt(word.length()-1));
    }

    public static void main(String[] args) {

        String[] words = {"aba","aa","ad","ba","a","b"};
        String[] queries = {"1-2","2-4"};

        List<Integer> result = new ArrayList<>();

        for(String q : queries){

            String[] parts = q.split("-");
            int start = Integer.parseInt(parts[0]) - 1;
            int end = Integer.parseInt(parts[1]) - 1;

            int count = 0;

            for(int i=start;i<=end;i++){

                if(i < words.length && special(words[i]))
                    count++;
            }

            result.add(count);
        }

        System.out.println(result);
    }
}
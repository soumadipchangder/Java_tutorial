package com;

import java.util.*;

public class RangeVowelCheck {

    static boolean vowel(char c){

        return "aeiou".indexOf(c) != -1;
    }

    static boolean valid(String s){

        return vowel(s.charAt(0)) && vowel(s.charAt(s.length()-1));
    }

    public static void main(String[] args) {

        String[] array1 = {"1-3","5-7","2-3"};
        String[] array2 = {"aba","cdc","pp","a","b"};

        int[] result = new int[array1.length];

        for(int i=0;i<array1.length;i++){

            String[] parts = array1[i].split("-");
            int start = Integer.parseInt(parts[0]) - 1;
            int end = Integer.parseInt(parts[1]) - 1;

            int count = 0;

            for(int j=start;j<=end && j<array2.length;j++){

                if(valid(array2[j]))
                    count++;
            }

            result[i] = count;
        }

        System.out.println(Arrays.toString(result));
    }
}

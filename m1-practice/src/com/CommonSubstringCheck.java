package com;

public class CommonSubstringCheck {

    static boolean hasCommonSubstring(String s1, String s2) {

        for (char c : s1.toCharArray()) {

            if (s2.indexOf(c) != -1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] a = {"ab", "cd", "ef"};
        String[] b = {"af", "ee", "ef"};

        for (int i = 0; i < a.length; i++) {

            if (hasCommonSubstring(a[i], b[i]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
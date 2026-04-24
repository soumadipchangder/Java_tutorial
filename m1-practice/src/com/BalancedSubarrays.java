package com;

public class BalancedSubarrays {

    public static int countBalanced(int[] arr) {

        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            int even = 0;
            int odd = 0;

            for (int j = i; j < n; j++) {

                if (arr[j] % 2 == 0)
                    even++;
                else
                    odd++;

                if (even % 2 == 0 && odd % 2 == 1)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        System.out.println(countBalanced(arr));
    }
}
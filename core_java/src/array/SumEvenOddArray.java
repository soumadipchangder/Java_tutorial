package array;

import java.util.Scanner;

public class SumEvenOddArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenSum = evenSum + a[i];
            } else {
                oddSum = oddSum + a[i];
            }
        }

        System.out.println("Sum of Even Elements = " + evenSum);
        System.out.println("Sum of Odd Elements  = " + oddSum);

        sc.close();
    }
}

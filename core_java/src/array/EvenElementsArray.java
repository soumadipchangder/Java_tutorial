package array;

import java.util.Scanner;

public class EvenElementsArray {

    public static int[] getEvenArray(int[] a) {

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }

        int[] evenArr = new int[count];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenArr[j] = a[i];
                j++;
            }
        }

        return evenArr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int[] even = getEvenArray(a);

        System.out.println("Even Elements Array:");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}

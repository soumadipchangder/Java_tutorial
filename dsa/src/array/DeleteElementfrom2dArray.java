package array;

import java.util.Scanner;

public class DeleteElementfrom2dArray {

    public static void main(String[] args) {

        int[][] arr = {
                {10, 5, 8},
                {7, 3, 9},
                {6, 4, 2}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to delete: ");
        int del = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == del) {
                    arr[i][j] = Integer.MIN_VALUE;
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("After deletion:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] != Integer.MIN_VALUE)
                        System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}

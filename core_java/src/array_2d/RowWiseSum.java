package array_2d;

import java.util.Scanner;

public class RowWiseSum {

    // Method to calculate row-wise sum
    public static int[] rowwiseSum(int[][] arr) {

        int[] sum = new int[arr.length]; // number of rows

        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            sum[i] = rowSum;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        // Input elements
        System.out.println("Enter " + (r * c) + " elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

        // Calling method
        int[] result = rowwiseSum(a);

        // Printing row-wise sums
        System.out.println("\nRow-wise Sum:");

        for (int i = 0; i < result.length; i++) {
            System.out.println("Sum of row " + i + " = " + result[i]);
        }

        sc.close();
    }
}

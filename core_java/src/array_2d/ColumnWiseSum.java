package array_2d;

import java.util.Scanner;

public class ColumnWiseSum {

    // Method to calculate column-wise sum
    public static int[] columnwiseSum(int[][] arr) {

        int cols = arr[0].length;      // number of columns
        int rows = arr.length;         // number of rows

        int[] sum = new int[cols];

        for (int j = 0; j < cols; j++) {       // column loop
            int colSum = 0;
            for (int i = 0; i < rows; i++) {   // row loop
                colSum += arr[i][j];
            }
            sum[j] = colSum;
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
        int[] result = columnwiseSum(a);

        // Printing column-wise sums
        System.out.println("\nColumn-wise Sum:");

        for (int j = 0; j < result.length; j++) {
            System.out.println("Sum of column " + j + " = " + result[j]);
        }

        sc.close();
    }
}

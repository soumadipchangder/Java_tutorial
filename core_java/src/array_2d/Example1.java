package array_2d;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][3];

        // Taking input
        System.out.println("Enter 6 elements:");

        for (int i = 0; i < 2; i++) {           // rows
            for (int j = 0; j < 3; j++) {       // columns
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

        // Printing array
        System.out.println("\n2D Array Elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

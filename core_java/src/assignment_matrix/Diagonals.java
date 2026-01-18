package assignment_matrix;

import java.util.*;

class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j] = sc.nextInt();

        System.out.print("Main: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i][i]+" ");

        System.out.print("\nSecondary: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i][n-i-1]+" ");
        sc.close();
    }
}


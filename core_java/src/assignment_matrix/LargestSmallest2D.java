package assignment_matrix;

import java.util.Scanner;

class LargestSmallest2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int r = sc.nextInt();
        System.out.print("Cols: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();

        int max = a[0][0], min = a[0][0];

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++){
                if(a[i][j] > max) max = a[i][j];
                if(a[i][j] < min) min = a[i][j];
            }

        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
        sc.close();
        }
}

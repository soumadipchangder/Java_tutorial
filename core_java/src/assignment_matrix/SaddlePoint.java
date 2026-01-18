package assignment_matrix;

import java.util.*;

class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < r; i++) {

            int minRow = a[i][0];
            int colIndex = 0;

            for(int j = 1; j < c; j++) {
                if(a[i][j] < minRow) {
                    minRow = a[i][j];
                    colIndex = j;
                }
            }

            boolean isSaddle = true;

            for(int k = 0; k < r; k++) {
                if(a[k][colIndex] > minRow) {
                    isSaddle = false;
                    break;
                }
            }

            if(isSaddle) {
                System.out.println("Saddle Point = " + minRow);
                found = true;
            }
        }

        if(!found)
            System.out.println("No Saddle Point");
        
        sc.close();
    }
}

package assignment_matrix;

import java.util.*;

class MultiplyMatrix {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        if(c1 != r2){
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] m = new int[r1][c2];

        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                a[i][j] = sc.nextInt();

        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                b[i][j] = sc.nextInt();

        for(int i=0;i<r1;i++)
            for(int j=0;j<c2;j++)
                for(int k=0;k<c1;k++)
                    m[i][j] += a[i][k]*b[k][j];

        for(int[] row: m){
            for(int x: row) System.out.print(x+" ");
            System.out.println();
            
        }
        sc.close();   }
}

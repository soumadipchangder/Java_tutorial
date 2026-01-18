package assignment_matrix;

import java.util.*;

class UpperTriangular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j) System.out.print(a[i][j]+" ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
        sc.close();
    }
}


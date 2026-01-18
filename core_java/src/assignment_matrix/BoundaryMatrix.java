package assignment_matrix;

import java.util.*;

class BoundaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt(), c=sc.nextInt();

        int[][] a = new int[r][c];

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=sc.nextInt();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0||j==0||i==r-1||j==c-1)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
            
        }
        sc.close();
    }
}

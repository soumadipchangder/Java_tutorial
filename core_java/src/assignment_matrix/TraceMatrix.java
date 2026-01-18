package assignment_matrix;

import java.util.*;

class TraceMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();

        int trace=0;
        for(int i=0;i<n;i++)
            trace+=a[i][i];

        System.out.println("Trace = "+trace);
        sc.close();
    }
}


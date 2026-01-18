package assignment_array;

import java.util.*;

class FibonacciInArray {
    static boolean isFibo(int n){
        int a=0,b=1;
        while(a<=n){
            if(a==n) return true;
            int c=a+b;
            a=b; b=c;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for(int x:a)
            if(isFibo(x)) System.out.print(x+" ");
        
        sc.close();
    }
}


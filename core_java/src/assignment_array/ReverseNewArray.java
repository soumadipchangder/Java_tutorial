package assignment_array;

import java.util.*;

class ReverseNewArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int k=0;
        for(int i=n-1;i>=0;i--)
            b[k++]=a[i];

        for(int x:b) System.out.print(x+" ");
        sc.close();
    }
}

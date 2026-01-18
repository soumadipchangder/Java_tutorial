package assignment_array;

import java.util.*;

class ReverseNoNewArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int i=0,j=n-1;
        while(i<j){
            int t=a[i]; a[i]=a[j]; a[j]=t;
            i++; j--;
        }

        for(int x:a) System.out.print(x+" ");
        sc.close();
    }
   
}

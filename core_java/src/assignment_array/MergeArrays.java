package assignment_array;

import java.util.*;

class MergeArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt(), n2=sc.nextInt();
        int[] a=new int[n1];
        int[] b=new int[n2];
        int[] c=new int[n1+n2];

        for(int i=0;i<n1;i++) a[i]=sc.nextInt();
        for(int i=0;i<n2;i++) b[i]=sc.nextInt();

        int k=0;
        for(int x:a) c[k++]=x;
        for(int x:b) c[k++]=x;

        for(int x:c) System.out.print(x+" ");
        sc.close();
    }
}


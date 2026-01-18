package assignment_array;

import java.util.*;

class InsertElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int index=sc.nextInt();
        int value=sc.nextInt();

        for(int i=n;i>index;i--)
            a[i]=a[i-1];

        a[index]=value;

        for(int x:a) System.out.print(x+" ");
        
        sc.close();
    }
}

package assignment_array;

import java.util.*;

class ProductArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        int prod=1;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            prod*=a[i];
        }
        System.out.println("Product = "+prod);
        sc.close();
    }
}


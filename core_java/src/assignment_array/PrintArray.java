package assignment_array;

import java.util.*;

class PrintArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        for(int x : a)
            System.out.print(x + " ");

        sc.close();
    }
}

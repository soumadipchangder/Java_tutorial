package assignment_array;

import java.util.*;

class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int key=sc.nextInt();
        boolean found=false;

        for(int i=0;i<n;i++){
            if(a[i]==key){
                System.out.println("Found at "+i);
                found=true;
                break;
            }
        }
        if(!found) System.out.println("Not Found");
        sc.close();
    }
}

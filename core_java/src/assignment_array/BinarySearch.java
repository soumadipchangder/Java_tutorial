package assignment_array;

import java.util.*;

class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int key=sc.nextInt();
        int l=0,h=n-1;
        boolean found=false;

        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==key){
                System.out.println("Found at "+mid);
                found=true;
                break;
            }
            else if(a[mid]<key) l=mid+1;
            else h=mid-1;
        }
        if(!found) System.out.println("Not Found");
        sc.close();
    }
}

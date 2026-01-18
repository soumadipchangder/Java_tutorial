package assignment_array;

import java.util.*;

class DuplicatePrimes {
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++)
            if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j] && isPrime(a[i]))
                    System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }
}


package assignment_array;

import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for(int i=0;i<n;i++){
            boolean dup=false;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]) dup=true;
            }
            if(!dup) System.out.print(a[i]+" ");
        }
        sc.close();
    }
}

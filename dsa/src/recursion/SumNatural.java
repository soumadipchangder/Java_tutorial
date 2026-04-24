package recursion;

import java.util.Scanner;

public class SumNatural {
    
    static int sum(int n) {
        if (n == 0)          // base condition
            return 0;
        else
            return n + sum(n - 1);   // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        System.out.println("Sum of first " + n + " natural numbers = " + sum(n));
    }
}

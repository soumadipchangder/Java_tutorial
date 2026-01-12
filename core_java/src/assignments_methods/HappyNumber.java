package assignments_methods;

import java.util.Scanner;

public class HappyNumber {
    public static boolean isHappy(int n) {

        System.out.println("\nSteps:");
        
        while (n != 1 && n != 4) {

            int temp = n;
            int sum = 0;

            System.out.print(temp + " -> ");

            while (n > 0) {
                int r = n % 10;
                sum = sum + (r * r);

                System.out.print(r + "² ");
                if (n / 10 != 0)
                    System.out.print("+ ");
                
                n = n / 10;
            }

            System.out.println("= " + sum);
            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isHappy(n))
            System.out.println("\nResult: Happy Number 😊");
        else
            System.out.println("\nResult: Not a Happy Number 😐");
        sc.close();
    }
}

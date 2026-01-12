package assignments_methods;

import java.util.Scanner;

public class Strong_number {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean isStrong(int n) {

        int temp = n;
        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum = sum + factorial(r);
            n = n / 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isStrong(n))
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
        sc.close();
    }
}

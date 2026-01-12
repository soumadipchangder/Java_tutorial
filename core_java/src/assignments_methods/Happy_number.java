package assignments_methods;

import java.util.Scanner;

public class Happy_number {
	
    public static boolean isHappy(int n) {

        while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int r = n % 10;
                sum = sum + (r * r);
                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isHappy(n))
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
        sc.close();
    }
}

package methods;

import java.util.Scanner;

class Power {

    public static int power(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter power (b): ");
        int b = sc.nextInt();

        int ans = power(a, b); 

        System.out.println("Result = " + ans);

        sc.close();
    }
}

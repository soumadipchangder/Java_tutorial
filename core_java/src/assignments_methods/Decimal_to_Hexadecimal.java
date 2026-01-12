package assignments_methods;

import java.util.Scanner;

public class Decimal_to_Hexadecimal {

    public static String decToHex(int n) {

        String hex = "";

        while (n > 0) {
            int r = n % 16;

            if (r < 10)
                hex = r + hex;
            else
                hex = (char)(r + 55) + hex;  // 10->A, 11->B...

            n = n / 16;
        }

        return hex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        System.out.println("Hex = " + decToHex(n));
        sc.close();
    }
}

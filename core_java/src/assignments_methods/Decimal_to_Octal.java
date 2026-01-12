package assignments_methods;

import java.util.Scanner;

public class Decimal_to_Octal {

    public static int decToOct(int n) {

        int oct = 0, place = 1;

        while (n > 0) {
            int r = n % 8;
            oct = oct + r * place;
            place = place * 10;
            n = n / 8;
        }

        return oct;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        System.out.println("Octal = " + decToOct(n));
        sc.close();
    }
}

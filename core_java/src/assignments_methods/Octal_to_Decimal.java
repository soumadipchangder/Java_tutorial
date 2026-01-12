package assignments_methods;

import java.util.Scanner;

public class Octal_to_Decimal {

    public static int octToDec(int n) {

        int dec = 0, place = 1;

        while (n > 0) {
            int r = n % 10;
            dec = dec + r * place;
            place = place * 8;
            n = n / 10;
        }

        return dec;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        System.out.println("Decimal = " + octToDec(n));
        sc.close();
    }
}

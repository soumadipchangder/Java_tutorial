package assignments_methods;

import java.util.Scanner;

public class Binary_to_Decimal {

    public static int binToDec(int n) {

        int dec = 0, place = 1;

        while (n > 0) {
            int r = n % 10;
            dec = dec + r * place;
            place = place * 2;
            n = n / 10;
        }

        return dec;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("Decimal = " + binToDec(n));
        sc.close();
    }
}

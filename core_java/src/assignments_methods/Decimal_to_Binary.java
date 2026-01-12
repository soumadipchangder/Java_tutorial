package assignments_methods;

import java.util.Scanner;

public class Decimal_to_Binary {

    public static int decToBin(int n) {

        int bin = 0, place = 1;

        while (n > 0) {
            int r = n % 2;
            bin = bin + r * place;
            place = place * 10;
            n = n / 2;
        }

        return bin;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("Binary = " + decToBin(n));
        sc.close();
    }
}

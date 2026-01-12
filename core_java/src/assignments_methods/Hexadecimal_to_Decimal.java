package assignments_methods;

import java.util.Scanner;

public class Hexadecimal_to_Decimal {

    public static int hexToDec(String hex) {

        int dec = 0, place = 1;

        for (int i = hex.length() - 1; i >= 0; i--) {

            char ch = hex.charAt(i);
            int val;

            if (ch >= '0' && ch <= '9')
                val = ch - '0';
            else
                val = ch - 55;   // A=10

            dec = dec + val * place;
            place = place * 16;
        }

        return dec;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        String hex = sc.next();

        System.out.println("Decimal = " + hexToDec(hex));
        sc.close();
    }
}

package methods;

import java.util.Scanner;

public class Digitcount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if (n == 0) count = 1;

        while (n != 0) {
            count++;
            n /= 10;
        }

        System.out.println(count);
        sc.close();
    }
}

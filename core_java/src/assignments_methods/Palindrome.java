package assignments_methods;

import java.util.Scanner;

class Palindrome {

    public static String palindrome(int n) {

        int temp = n;
        int rev = 0;

        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if (temp == rev)
            return "Good";
        else
            return "Bad";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        String result = palindrome(n);
        System.out.println(result);
        sc.close();
    }
}

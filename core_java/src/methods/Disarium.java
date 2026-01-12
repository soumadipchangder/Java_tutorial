package methods;

import java.util.Scanner;

class Disarium {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int power(int r, int p) {
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * r;
        }
        return res;
    }

    public static boolean isDisarium(int n) {

        int temp = n;
        int sum = 0;

        int pos = countDigits(n);

        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, pos);
            pos--;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isDisarium(n))
            System.out.println("Disarium Number");
        else
            System.out.println("Not Disarium Number");

        sc.close();
    }
}

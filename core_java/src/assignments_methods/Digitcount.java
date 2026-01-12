package assignments_methods;

import java.util.Scanner;

class Digitcount {

    public static boolean digitcount(int n) {
        int evenCount = 0;
        int oddCount = 0;

        while (n != 0) {
            int r = n % 10;

            if (r % 2 == 0)
                evenCount++;
            else
                oddCount++;

            n = n / 10;
        }

        return evenCount == oddCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (digitcount(n))
            System.out.println("Even and Odd digit count are SAME");
        else
            System.out.println("Even and Odd digit count are NOT SAME");
        sc.close();
    }
    
}

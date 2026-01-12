package assignments_methods;

import java.util.Scanner;

public class Xylem_Phloem_number {

    public static boolean isXylem(int n) {

        int last = n % 10;

        int meanSum = 0;
        n = n / 10;

        while (n > 9) {
            int r = n % 10;
            meanSum = meanSum + r;
            n = n / 10;
        }

        int first = n;

        int extremeSum = first + last;

        return extremeSum == meanSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isXylem(n))
            System.out.println("Xylem Number");
        else
            System.out.println("Phloem Number");
        sc.close();
    }
}

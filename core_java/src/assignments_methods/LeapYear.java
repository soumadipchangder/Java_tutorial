package assignments_methods;

import java.util.Scanner;

class LeapYear {

    public static boolean leapyear(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (leapyear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        
        sc.close();
    }
}

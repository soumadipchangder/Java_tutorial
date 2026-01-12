package methods;

import java.util.Scanner;

class Calculator1{
	
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b != 0)
            return a / b;
        else
            return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose Operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int result;

        switch (choice) {
            case 1:
                result = add(a, b);
                System.out.println("Addition = " + result);
                break;

            case 2:
                result = subtract(a, b);
                System.out.println("Subtraction = " + result);
                break;

            case 3:
                result = multiply(a, b);
                System.out.println("Multiplication = " + result);
                break;

            case 4:
                if (b != 0) {
                    result = divide(a, b);
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

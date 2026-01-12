package scanner;

import java.util.Scanner;

class PersonalInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your weight (kg): ");
        float weight = sc.nextFloat();
        System.out.print("Enter your height (cm): ");
        float height = sc.nextFloat();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();
        System.out.print("Enter your email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);
        System.out.print("Are you married? (true/false): ");
        boolean married = sc.nextBoolean();

        System.out.println("\n----- Personal Details -----");
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Married: " + married);

        sc.close();
    }
}

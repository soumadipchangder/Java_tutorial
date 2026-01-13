package object;

import java.util.Scanner;

public class Employee2 {
    int id;
    String name;
    double salary;

    public void work() {
        System.out.println(name + " is working");
    }

    public void printEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter id: ");
            emp[i].id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter name: ");
            emp[i].name = sc.nextLine();

            System.out.print("Enter salary: ");
            emp[i].salary = sc.nextDouble();
        }

        System.out.println("\n----- Employee Details -----");
        for (int i = 0; i < n; i++) {
            emp[i].work();
            emp[i].printEmployee();
            System.out.println();
        }

        sc.close();
    }
}

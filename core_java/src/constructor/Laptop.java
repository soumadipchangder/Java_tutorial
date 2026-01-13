/***************************************************
 *      C O M P A R E   ( O N E   P A R A M )      *
 *            L A P T O P   C L A S S              *
 ***************************************************/

package constructor;

import java.util.Scanner;

public class Laptop {

    String brand;
    double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void compare(Laptop other) {

        if (this.price > other.price) {
            System.out.println(this.brand + " laptop is priced more");
        } else if (other.price > this.price) {
            System.out.println(other.brand + " laptop is priced more");
        } else {
            System.out.println("Both laptops have same price");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first laptop brand: ");
        String b1 = sc.nextLine();
        System.out.print("Enter first laptop price: ");
        double p1 = sc.nextDouble();

        sc.nextLine();

        System.out.print("\nEnter second laptop brand: ");
        String b2 = sc.nextLine();
        System.out.print("Enter second laptop price: ");
        double p2 = sc.nextDouble();
        Laptop l1 = new Laptop(b1, p1);
        Laptop l2 = new Laptop(b2, p2);

        l1.compare(l2);

        sc.close();
    }
}

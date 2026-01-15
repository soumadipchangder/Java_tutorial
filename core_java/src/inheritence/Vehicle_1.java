package inheritence;

public class Vehicle_1 {
    String color;
    public void printVehicle() {
        System.out.println("Color: " + color);
    }
    public static void main(String[] args) {
    	System.out.println("Bike details:\n");
        Bike1 b = new Bike1("Black", "Ducati Superleggera V4", 15000000);
        b.printBike();
        System.out.println("\nCar details:\n");
        Car c = new Car("Black", "Rolls-Royce Phantom", 120000000);
        c.printCar();
    }
}
class Bike1 extends Vehicle_1 {
    String brand;
    long price;
    Bike1(String color, String brand, long price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }
    public void printBike() {
        printVehicle();
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
class Car extends Vehicle_1 {
    String brand;
    long price;
    Car(String color, String brand, long price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }
    public void printCar() {
        printVehicle();
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

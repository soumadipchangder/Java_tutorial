package object;
public class HelperLaptop {
    static class Laptop {
        double price;
        String brand;
        public Laptop() {}
        public Laptop(double price, String brand) {
            this.price = price;
            this.brand = brand;
        }
        void display() {
            System.out.println(brand + " : ₹" + price);
        }
    }
    public static Laptop getLaptop() {
        return new Laptop();
    }
    public static Laptop verifyPrice(double price, String brand) {
        if (price < 50000 || price > 1000000) {
            System.out.println("Price of laptop is invalid.");
            return null;
        }
        return new Laptop(price, brand);
    }
    public static void main(String[] args) {
        Laptop l1 = HelperLaptop.verifyPrice(80000, "Apple");
        Laptop l2 = HelperLaptop.verifyPrice(8000, "XYZ");
        if (l1 != null)
            l1.display();
        else
            System.out.println("Laptop 1 not created");
        if (l2 != null)
            l2.display();
        else
            System.out.println("Laptop 2 not created");
    }
}

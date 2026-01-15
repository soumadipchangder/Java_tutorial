package object;

public class HelpLaptop {
    static class Laptop {
        int price;
        String brand;

        public Laptop(int price, String brand) {
            this.price = price;
            this.brand = brand;
        }

        void display() {
            System.out.println(brand + " : ₹" + price);
        }
    }
    public static Laptop getLaptop(int price, String brand) {
        return new Laptop(price, brand);
    }

    public static void compareLaptop(Laptop l1, Laptop l2) {
        if (l1.price > l2.price) {
            System.out.println(l1.brand + " laptop is priced more");
        } else if (l2.price > l1.price) {
            System.out.println(l2.brand + " laptop is priced more");
        } else {
            System.out.println("Both laptops have same price");
        }
    }

    public static void main(String[] args) {

        Laptop l1 = getLaptop(80000, "Apple");
        Laptop l2 = getLaptop(65000, "Dell");

        l1.display();
        l2.display();

        compareLaptop(l1, l2);
    }
}

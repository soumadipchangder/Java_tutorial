/********************************************************
 *    C O N S T R U C T O R   O V E R L O A D I N G     *
 *                P R O D U C T   C L A S S             *
 ********************************************************/

package constructor;

public class Product {

    int id;
    String name;
    double price;
    double rating;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, double price) {
        this(id, name);
        this.price = price;
    }

    public Product(int id, String name, double price, double rating) {
        this(id, name, price);
        this.rating = rating;
    }

    public void display() {
        System.out.println("----------------------");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Price  : " + price);
        System.out.println("Rating : " + rating);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Product p1 = new Product(101, "Pen");
        Product p2 = new Product(102, "Book", 120.50);
        Product p3 = new Product(103, "Mobile", 150000, 9.5);

        p1.display();
        p2.display();
        p3.display();
    }
}

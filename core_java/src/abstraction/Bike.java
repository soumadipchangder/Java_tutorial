package abstraction;

public class Bike extends Vehicle {

    @Override
    public void type() {
        System.out.println("This is a Bike");
    }

    @Override
    public void price() {
        System.out.println("Bike price is 1.5 Lakhs");
    }
}

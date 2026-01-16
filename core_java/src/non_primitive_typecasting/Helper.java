package non_primitive_typecasting;

import inheritence.Vehicle;
import inheritence.Car;

public class Helper {

    public static void main(String[] args) {

        // Upcasting: Car -> Vehicle
        Vehicle v = new Car();

        // Passing Vehicle reference
        getVehicle(v);
    }

    public static void getVehicle(Vehicle v) {

        // Downcasting: Vehicle -> Car (VALID)
        Car c = (Car) v;
        c.no_of_passengers();
    }
}

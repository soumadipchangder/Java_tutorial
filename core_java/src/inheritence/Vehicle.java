package inheritence;

public class Vehicle {
	String Brand;
	String colour;
	double price;
	
	public void printVehicle() {
		System.out.println(Brand);
		System.out.println(colour);
		System.out.println(price);
		
	}
	
	public static void main(String[] args) {
		Bike b = new Bike("BMW","Black", 150);
		b.printVehicle();
	}

}

class Bike extends Vehicle{
	Bike(String Brand, String colour, double price){
		this.Brand = Brand;
		this.colour = colour;
		this.price = price;
	}
}
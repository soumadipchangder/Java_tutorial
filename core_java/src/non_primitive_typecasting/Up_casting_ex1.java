package non_primitive_typecasting;

public class Up_casting_ex1 {
	
	public void vehicle() {
		System.out.println("Main class");
	}
	
	public static void main(String[] args) {
	    car c = new car();
	    Up_casting_ex1 u = c;   // Upcasting
	    u.vehicle();

	    u = new Bike();        // Upcasting

	    Bike b = (Bike) u;     // Downcasting
	    b.vehicle();
	    System.out.println("Top speed: " + b.top_speed());

		
		
	}
	
	
}

class car extends Up_casting_ex1{
	public void no_of_passengers() {
		System.out.println("no of passemgers: 44");
	}
}

class Bike extends Up_casting_ex1{
	public int top_speed() {
		int top_speed = 120;
		return top_speed;
	}
}

class Train extends Up_casting_ex1{
	public void ticket_price() {
		System.out.println(1760);
	}
}
package abstraction;

public class PersonDriver {
	public static void main(String[] args) {
		Vehicle v =HelpVehicle.getVehicle();
		v.type();
		v.price();
	}

}

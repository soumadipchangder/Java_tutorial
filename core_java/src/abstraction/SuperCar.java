package abstraction;

public class SuperCar {
	private Engine engine;//COMPOSITION
	private Pilot pilot; //AGGREGATION
	public SuperCar() {
		engine=new Engine();
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Pilot getPilot() {
		return pilot;
	}
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	public static void main(String[] args) {
		SuperCar supercar=new SuperCar();
		supercar.engine.horsepower();
		supercar.setPilot(new Pilot());
		supercar.getPilot().driver();
		
	}
	
}

class Engine{
	public void horsepower() {
		System.out.println("This Engine provides 1600 HorsePower. ");
	}
}
class Pilot{
	public void driver() {
		System.out.println("It will be fun to drive this car. ");
	}
}

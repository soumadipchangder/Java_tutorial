package inheritence;

public class Animal {
	
	String animal;
	String colour;
	int no_of_legs;
	
	public void print_animal() {
		System.out.println(animal);
		System.out.println(colour);
		System.out.println(no_of_legs);
	}
	
	public static void main(String[] args) {
		
		Animal_details A = new Animal_details("Dog","brown", 4);
		A.print_animal();
		
		
	}

}

class Animal_details extends Animal{
	Animal_details(String animal, String colour ,int no_of_legs ){
	
		this.animal = animal;
		this.colour = colour;
		this.no_of_legs = no_of_legs;
	}
}

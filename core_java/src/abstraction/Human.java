package abstraction;

public class Human {
	
	private Heart heart; //COMPOSITION
	private Address address; //AGGREGATION
	public Human() {
		heart=new Heart();
	}
	
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public static void main(String[] args) {
		Human human=new Human();
		human.heart.pump();
		human.setAddress(new Address());
		human.getAddress().location();
	}

}
class Heart{
	public void pump() {
		System.out.println("Heart is Pumping");
	}
}
class Address{
	public void location() {
		System.out.println("India");
	}
}
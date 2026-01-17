package polymorphism;

public class Child extends Parent{
	@Override
	public void home() {
		System.out.println("Child");
	}
	public static void home2() {
		System.out.println("Child Static method");
	}
	public void bike(){
		System.out.println("BMW");
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Parent p=new Parent();
		p.home();
		//p.bike;
		Child c =new Child();
		c.home();
		c.bike();
		Parent p2=new Child();
		p2.home();
		p2.home2();
		//p2.bike;		
	}
}

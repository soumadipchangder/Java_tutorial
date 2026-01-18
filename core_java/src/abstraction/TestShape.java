package abstraction;

abstract class Shape {
	
	abstract void area();
	void display() {
		System.out.println("What is your area?");
	}

}
class Circle extends Shape{
	@Override
	void area() {
		System.out.println("My area is Circle");
	}
}
class Rectangle extends Shape{
	@Override
	void area() {
		System.out.println("My area is Rectangle");
	}
}
public class TestShape{
	public static void main(String[] args) {
		Shape s1=new Circle();
		s1.area();
		System.out.println("-----------"); 
		Shape s2=new Rectangle();
		s2.area();
	}
}
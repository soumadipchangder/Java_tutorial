package super_example;

public class Laptop extends Product {
	long price;
	String processor;
	public Laptop(String brand,long price,String processor) {
		super(brand);
		this.price=price;
		this.processor=processor;
	}
	public static void main(String[] args) {
		Laptop m=new Laptop("Apple",350000,"M5Pro chip");
		System.out.println(m.brand);
		System.out.println(m.price);
		System.out.println(m.processor);
	}


}

package super_example;

public class Mobile extends Product{
	long price;
	String sim;
	public Mobile(String brand,long price,String sim) {
		super(brand);
		this.price=price;
		this.sim=sim;
	}
	public static void main(String[] args) {
		Mobile m=new Mobile("Apple",150000,"Jio");
		System.out.println(m.brand);
		System.out.println(m.price);
		System.out.println(m.sim);
	}

}

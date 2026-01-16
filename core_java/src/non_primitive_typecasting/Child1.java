package non_primitive_typecasting;

public class Child1 extends Parent1{
	long phone;
	public Child1(String name,long phone) {
		super(name);
		this.phone=phone;
	}
	public static void main(String[] args) {
		Child1 c =new Child1("XYZ",777);
		System.out.println(c.name);
		System.out.println(c.phone);
	}

}

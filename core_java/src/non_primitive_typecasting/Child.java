package non_primitive_typecasting;

import inheritence.Parent;

public class Child extends Parent{
	public void m2() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		Child c=new Child();
		Parent p=c; //UPCASTING
		p.m1();
		//p.m2; CET
		Child c2=(Child)p; //DOWNCASTING
		c2.m1();
		c2.m2();
	}

}

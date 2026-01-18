package abstraction;

public class CalciChild1 extends Calculator{
	
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	
	@Override
	public int multi(int a,int b) {
		return a*b;
	}
	public void m1() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		Calculator c =new CalciChild1();
		System.out.println(c.add(10,20));
		System.out.println(c.multi(10,20));
		System.out.println();
		//c.m1(); CTE
	}

}

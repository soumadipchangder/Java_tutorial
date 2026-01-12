package methods;

public class Example2 {
	public static void m1() {
		m2();
		System.out.println("m1");
	}
	public static void m2() {
		System.out.println("m2");
		m3();
	}
	public static void m3() {
		m4();
		System.out.println("m3");
	}
	public static void m4() {
		System.out.println("m4");
	}
	public static void main(String[] args) {
		m1();
	}
	

}

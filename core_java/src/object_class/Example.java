package object_class;

class Example {
	private static int  a=10;
	private static void m1() {
		System.out.println("private method ");
	}
	private Example() {
		System.out.println("private constructor");
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		Example e =new Example();
	}

}

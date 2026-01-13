package static_;

class Static_Variable {
	static int a=10;
	static int b;
	static String pm="Modi";
	static String c;
//	public static void main(String[] args) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(pm);
//		System.out.println(c);
//	}
	public static void e2() {
		int a=20;
		System.out.println(a);
		System.out.println(Static_Variable.a);// classname if you want to use static variable, when both variable name is same
	}
	public static void e3() {
		System.out.println(Example1.name);
		System.out.println(Example1.age);
	}
	public static void el() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(pm);
		System.out.println(c);
	}
	public static void main(String[] args) {
		e3();
	}
}


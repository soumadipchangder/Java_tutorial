package static_;

public class Static_Block {
	static int a=20; //Non-static var
	static {
		System.out.println("SB1");
		int a=10; //local var
		System.out.println(a);
		System.out.println(Static_Block.a);
	}
	static {
		System.out.println("SB2");
	}
	public static void main(String[] args) {
			System.out.println("main");
	}
	static {
			System.out.println("SB3");
	}

}


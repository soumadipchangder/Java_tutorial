package non_static;

@SuppressWarnings("all")
public class Non_Static_Block {
	static {
		System.out.println("N-S B 1");
	}
	static {
		System.out.println("N-S B 2");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		@SuppressWarnings("unused")
		Non_Static_Block e1 = new Non_Static_Block();
		@SuppressWarnings("unused")
		Non_Static_Block e2 = new Non_Static_Block();
		System.out.println("main end");
	}

}

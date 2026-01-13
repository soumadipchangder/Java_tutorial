package non_static;

public class Non_Static_Block {
	{
		System.out.println("N-S B 1");
	}
	{
		System.out.println("N-S B 2");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Non_Static_Block e1=new Non_Static_Block();
		Non_Static_Block e2=new Non_Static_Block();
		System.out.println("main end");
	}

}

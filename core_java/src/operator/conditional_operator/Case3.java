package operator.conditional_operator;

public class Case3 {
	public static void main(String[] args) {
//		greatest between three
		
		int a = 2, b = 3, c = 5;
		System.out.println((a > b && a > c) ? a : ((b > c) ? b : c));
	}

}

package operator.conditional_operator;

public class Case7 {
	public static void main(String[] args) {
//		
//		biggest between four
		
		int a = 32, b = 23, c = 15, d = 7;
		System.out.println((a > b && a > c && a > d) ? a : ((b > c && b > d) ? b : (c > d) ? c : d));
	}

}

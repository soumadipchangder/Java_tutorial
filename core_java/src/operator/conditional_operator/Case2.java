package operator.conditional_operator;

public class Case2 {
	public static void main(String[] args) {
//		greatest between three
//		
		int a=2,b=3,c=5;
		int res = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Greatest of three is :- " + res);
	}

}

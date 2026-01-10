package operator.conditional_operator;

public class Case4 {
	public static void main(String[] args) {
//		greatest between three
		
		int a=50,b=100,c=15;
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		System.out.println("Biggest Number:- "+big);
	}

}

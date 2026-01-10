package operator.conditional_operator;

public class Case5 {
	public static void main(String[] args) {
//		
//		biggest between four
		
		int a=50,b=100,c=15,d=200;
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		big=(big>d)?big:d;
		System.out.println("Biggest Number:- "+big);
	}

}

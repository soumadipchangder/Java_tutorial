package operator.conditional_operator;

public class Case6 {
	public static void main(String[] args) {
//		
//		biggest between four
		
		int a=5,b=10,c=15,d=2;
		int big1=(a>b)?a:b;
		int big2=(c>d)?c:d;
		int big3=(big1>big2)?big1:big2;
		System.out.println("Biggest Number:- "+big3);
	}

}

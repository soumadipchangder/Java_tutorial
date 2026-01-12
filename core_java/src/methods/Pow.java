package methods;

public class Pow {
	public static int power(int b, int p) {
		int pow=1;
		while(p>0) {
			pow=pow*b;
			p--;
		}
		return pow;
	}
	public static void main(String[] args) {
		System.out.println(power(2,4));
	}

}

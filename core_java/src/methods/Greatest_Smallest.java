package methods;

public class Greatest_Smallest {
	public static void greatest(int a,int b,int c) {
		String res = (a>b && a>c)?"a is greater":((b>c)?"b is greater":"c is greater");
		System.out.println(res);
	}
	public static void smallest(int a, int b, int c) {
		String res = (a<b && a<c)?"a is smaller":((b<c)?"b is smaller":"c is smaller");
		System.out.println(res);
	}
	public static void main(String[] args) {
		greatest(40,50,30);
		smallest(40,50,30);
	}

}

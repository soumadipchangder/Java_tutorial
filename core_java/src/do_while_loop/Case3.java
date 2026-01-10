package do_while_loop;

public class Case3 {
	public static void main(String[] args) {
		int n=123;
		int sum=0;
		do {
			sum=sum+n%10;
			n=n/10;
		}while(n>0);
		System.out.println(sum);
	}

}

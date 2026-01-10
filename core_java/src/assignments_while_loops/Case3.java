package assignments_while_loops;

public class Case3 {
	public static void main(String[] args) {
		int n=1020300000;
		int zerocount=0;
		int rem;
		while(n>0) {
			rem=n%10;
			if (rem==0)
				zerocount++;
			n=n/10;
		}
		System.out.println(zerocount);
	}

}

package assignments_while_loops;

public class Case1 {
	public static void main(String[] args) {
		int n =123456;
		int count=0;
		while(n>0)
		{
			n/=10;
			count+=1;
		}
		System.out.println(count);
	}
	

}

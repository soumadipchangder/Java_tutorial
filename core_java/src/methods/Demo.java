package methods;
import java.util.scanner;

public class Demo {
//	public static void main(String[] args) {
//		add();
//		add(5,10,15,20);
//		add(1,2);
//		
//	}
//	public static void add(int... n) {
//		int sum=0;
//		for(int i:n) {
//			sum=sum+i; //for each loop
//		}
//		System.out.println(sum);
//	}
	public static void main(String[] args) {
		add("xyz");
		add("xyz",5,10,15,20);
		add("xyz",1,2);
			
	}
	public static void add(String s,int... n) {
		int sum=0;
		System.out.println(n.length);
		for(int i:n) {
			sum=sum+i; //for each loop
		}
		System.out.println(sum);
	}
	

}

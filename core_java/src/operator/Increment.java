package operator;

public class Increment {
	
	public static void main(String[] args) {
		
//		int a=5;
//		System.out.println(++a);
//		System.out.println(a);
//		int a1=5;
//		System.out.println(a1++);
//		System.out.println(a1);
//		int a=5,b=3;
//		a++;
//		++a;
//		b++;
//		++b;
//		int c= a + b + ++a + b++;
//		System.out.println(a + ++c + b++ + c);
		int a=5;
		int b=10;
		a+=2;
		b/=2;
		a=a++ + --a + --a + --a + b++ + b--;
		b=b++ + a-- + a++ + ++b;
		System.out.println(a);
		System.out.println(b);
		
	}

}

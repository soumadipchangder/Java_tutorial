package string_package;

public class StringArrayConversion {
	public static void main(String[] args) {
		////String to Array... to print characters
		String s="abcdefGHI1234";
		char[] c= s.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		////Array to String... to print String 
		String st=new String(c);
		System.out.println(st);
	}

}

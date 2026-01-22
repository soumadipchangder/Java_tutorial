package string_package;

public class Demo2 {
	public static void main(String[] args) {
		String s1=new String("XYZ");
		String s2="ABC";
		String s3="XYZ";
		String s4=new String("XYZ");
		String s5=new String("ABC");
		String s6="ABC";
		System.out.println(s1.equals(s3));//true
		System.out.println(s1==s3);//false
		System.out.println(s4.equals(s5));//false
		System.out.println(s4==s5);//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1==s4);//false
		System.out.println(s2.equals(s5));//true
		System.out.println(s2.equals(s6));//true
		System.out.println(s2==s6);//true
		
		
	}

}

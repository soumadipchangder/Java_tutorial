package string_package;

public class StringMethods {

    public static void main(String[] args) {

        String s = "abcd1234ef";
        countAlphabet(s); 
        
        //////Trim method
        String a = " XYZ ABC ";
		System.out.println(a);
		System.out.println(a.trim());// trim removes spaces before and after the string
		
		/////Substring method
		String b="abcde";//a-0,b-1,c-2,d-3,e-4
		System.out.println(b.substring(1));//bcde
		System.out.println(b.substring(2));//cde
		System.out.println(b.substring(1,4));//bcd
		System.out.println(b);//abcde
		
		/////////////String -> char[]
		char[] c=b.toCharArray();//covert string directly to array
		for (int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		////////////Char[] -> String
		String st=new String(c);
		System.out.println(st);
    }

    public static void countAlphabet(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                count++;
            }
        }

        System.out.println("Number of alphabets = " + count);
    }
}

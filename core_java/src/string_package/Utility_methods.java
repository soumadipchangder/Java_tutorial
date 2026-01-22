package string_package;

import java.util.Arrays;

public class Utility_methods {
	public static void main(String[] args) {
		char[] ch= {'b','a','c'};
		char[] ch2= {'c','a','b'};
		Arrays.sort(ch);//sort in ascending order
		System.out.println(Arrays.toString(ch));
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch, ch2));
		System.out.println(Arrays.binarySearch(ch, 'a'));
	}

}

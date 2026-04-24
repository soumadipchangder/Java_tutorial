package ColleectionFramework;

import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		List<String>l=new LinkedList<String>();
		
		l.add("java");
		l.add("python");
		l.add("cpp");
		
		System.out.println(l.get(0));
		
		l.set(1, "javaScript");
		System.out.println(l);
		
		l.remove("cpp");
		System.out.println(l);
	}

}

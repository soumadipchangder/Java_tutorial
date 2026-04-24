package ColleectionFramework;

import java.util.HashSet;

public class HashSetExample1 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashSet<Integer>h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(40);
		h1.add(null);
		h1.add(30);
		h1.add(10);
		h1.add(20);
		
		System.out.println(h1);
		System.out.println(h1.contains(50));
		System.out.println(h1.contains(40));
		h1.remove(40);
		System.out.println(h1);
		
		@SuppressWarnings("rawtypes")
		HashSet h2 = new HashSet();
		h2.add(10);
		h2.add("hero");
		h2.add("hero");
		h2.add(null);
		h2.add(true);
		h2.add(10);
		
		System.out.println(h2);
	}

}

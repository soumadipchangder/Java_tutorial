package ColleectionFramework;

import java.util.TreeSet;

public class TreeSetExample {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("xyz");
		set.add("abc");
		set.add("mno");
		set.add("xyz");
		
		System.out.println(set);
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(60);
		t.add(50);
		t.add(40);
		t.add(60);
		
		System.out.println(t);
	}

}

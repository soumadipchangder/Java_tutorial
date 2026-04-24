package collection_framework;
import java.util.*;

public class Treeset_Example {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		TreeSet t = new TreeSet();
		t.add("XYZ");
		t.add("XYp");
		t.add("X7Z");
		System.out.println(t);
		
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(40);
		set.add(60);
		set.remove(10);
		
		System.out.println(set);
		
		
		
	}

}
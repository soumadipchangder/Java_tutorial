package ColleectionFramework;

import java.util.Collection;
import java.util.HashMap;

public class HashMapExample {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap map=  new HashMap();
		map.put("key", "value");
		map.put(66, "xyz");
		map.put('a', 100);
		
		System.out.println(map);
		map.put(66, "abc");
		System.out.println(map);
		
		HashMap<Integer, String>map1 = new HashMap<Integer, String>();
		map1.put(1, "Value");
		map1.put(2, "xyz");
		map1.put(66, "aaa");
		map1.put(66, "abc");
		map1.put(10, "Value");
		
		System.out.println(map1);
		System.out.println(map1.remove(1, "Value"));
		System.out.println(map1);
		System.out.println(map1.remove(5, "Value"));
		System.out.println(map1.keySet());
		System.out.println(map1.values());
		System.out.println(map1.get(66));
		
		Collection<String>a1 = map1.values();
		System.out.println(a1);
		
		
	}
	
}
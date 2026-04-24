package ColleectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ListIterator;

@SuppressWarnings("unused")
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Iterator<Integer>i=list.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("------------------");
		
		ListIterator<Integer>li = list.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		System.out.println("------------------");
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		System.out.println();
		System.out.println("------------------");
	}
	
}
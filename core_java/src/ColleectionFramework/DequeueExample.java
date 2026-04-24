package ColleectionFramework;

import java.util.ArrayDeque;


public class DequeueExample {

	public static void main(String[] args) {
		ArrayDeque<Integer>a = new ArrayDeque<Integer>();
		a.offerFirst(10);
		a.offerLast(20);
		a.offer(30);
		a.offerFirst(10);
		a.offerLast(40);
		a.offerFirst(50);
		
		System.out.println(a);
		
		a.pollFirst();		System.out.println(a);
		a.pollLast();		System.out.println(a);
	}

}
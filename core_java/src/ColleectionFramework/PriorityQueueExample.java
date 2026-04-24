package ColleectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer>p=new PriorityQueue<Integer>();
		p.offer(10);
		p.offer(25);
		p.offer(30);
		p.offer(65);
		p.offer(100);
		
		System.out.println(p.peek());
		
		p.poll();
		
		System.out.println(p);
	}
}

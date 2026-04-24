package day_30_01;
import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue {

	public static void main(String[] args) {
		
		/*Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println(q);
		System.out.println(q.remove());
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		*/
		 Queue<String> tasks = new LinkedList<>();

	        tasks.add("Eat");
	        tasks.add("Football");
	        tasks.add("Sleep");
	        tasks.add("Repeat");
	        
	        
	        while (!tasks.isEmpty()) {
	            String currentTask = tasks.poll();
	      
	            System.out.println(currentTask+ " completed\n");
	        }

	        System.out.println("All tasks completed!");
	}
}
package heap;
import java.util.*;

public class TopKMax {

    public static List<Integer> topKMax(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll(); 
            }
        }

        return new ArrayList<>(queue);
    }

    public static void main(String[] args) {
        System.out.println(topKMax(new int[]{1,2,3,4,5}, 4));
    }
}

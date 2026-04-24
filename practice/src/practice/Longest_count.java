package practice;

import java.util.HashSet;
import java.util.Set;

public class Longest_count {
	public static int func(int arr[],int n) {
		if (n == 0) {
			return 0;
		}
		int longest = 1;
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		
		for (int num : set) {
			if (!set.contains(num - 1)) {
				int count = 1;
				int x = num;
				
				while (set.contains(x + 1)) {
					x += 1;
					count += 1;
					longest = Math.max(count, longest);
				}
				
			}
		}
		return longest;
		
	}
	public static void main(String[] args) {
		int arr[] = {100,1,101,2,3,4,5};
		int n = arr.length;
		System.out.println(func(arr,n));
		
	}

}

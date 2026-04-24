package practice;
import java.util.*;


public class First_duplicate {
	public static int check_duplicate(int arr[],int n) {
		Set<Integer> set = new HashSet<>();
		
		for(int num : arr)  {
			if (!set.add(num)) {
				return num;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,2,3,4,4};
		int n = arr.length;
		System.out.println(check_duplicate(arr,n));
		
	}
}



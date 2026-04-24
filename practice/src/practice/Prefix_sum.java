package practice;

import java.util.*;

public class Prefix_sum {
	public static List<Integer> getList(int arr[],int n){
		List<Integer> list = new ArrayList<>();
		int prefix = arr[0];
		list.add(prefix);
		for (int i = 1; i < n; i++) {
			prefix += arr[i];
			list.add(prefix);
		}
		return list;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		System.out.println(getList(arr,n));
	}

}

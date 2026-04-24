package practice;

public class Subarraysum_withk {
	public static int func(int arr[],int k,int n) {
		int left = 0;
		int sum = 0;
		int count = 0;
		
		for(int right = 0; right < n; right++) {
			sum += arr[right];
			
			while (sum > k && left <= right) {
				sum -= arr[left];
				left += 1;
			}
			
			if (sum == k) {
				for(int i = left; i <= right; i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
				count += 1;
			}
			
		}
		return count;
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,-5,10};
		int[] arr2 = {1,2,3,5,10};
		int k1 = 3;
		int n = arr.length;
		int n2 = arr2.length;
		int k = 5;
		System.out.println(func(arr,k,n)); 
		System.out.println(func(arr2,k1,n2)); 
		
	}

}

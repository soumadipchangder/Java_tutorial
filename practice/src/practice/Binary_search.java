package practice;

public class Binary_search {
	
	// Iterative Approach
	public static int binary_search(int arr[],int low,int high,int key) {
		while (low <=high) {
			int mid = (low + (high - low) / 2);
			if (arr[mid] == key) {
				return mid;
			}
			else if (arr[mid] < key) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	// Recursion code.. time complexity :- log n, space complexity :- O(n)(nearly)
	public static int binary(int arr[],int low,int high,int key) {
		if (low <= high) {
			int mid = (low + (high - low) / 2);
			if (arr[mid] == key) {
				return mid;
			}
			else if (arr[mid] < key) {
				return binary(arr,mid + 1,high,key);
			}
			else {
				return binary(arr,low,mid - 1,key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};  // array always in sorted order... Time complexity :- logn and space complexity :- constant time
		System.out.println(binary_search(arr,0,arr.length -1,5));
		System.out.println(binary(arr,0,arr.length -1,5));

	}

}

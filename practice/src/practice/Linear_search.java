package practice;

public class Linear_search {
	public static boolean linear_search(int arr[],int n,int key) {
		for(int num : arr) {
			if (num == key) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {2,1,3,4,5};
		System.out.println(linear_search(arr,arr.length,10));
	}
}

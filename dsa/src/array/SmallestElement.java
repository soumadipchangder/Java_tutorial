package array;

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr= {10,2,3,4,5,6,7};
		int min=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}

package array;

public class Sample {
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[4];

        arr1[0] = 12;
        arr1[1] = 23;
        arr1[2] = 23;
        arr1[3] = 234;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.println(arr1[i]);
        }
	

}
	
}
package array;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

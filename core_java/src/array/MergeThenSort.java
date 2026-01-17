package array;

public class MergeThenSort {

    public static void mergeSorted(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // merge while both arrays have elements
        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // remaining elements of a
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        // remaining elements of b
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        // print merged sorted array
        System.out.println("Merged Sorted Array:");
        for (int x = 0; x < c.length; x++) {
            System.out.print(c[x] + " ");
        }
    }

    public static void main(String[] args) {

        // already sorted arrays
        int[] a = {1,3,5,7,9};
        int[] b = {1,2,3,4,5,6,7,8,9,10};

        mergeSorted(a, b);
    }
}

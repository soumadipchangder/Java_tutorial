package array;

public class Biggest_Smallest_inArray {

    public static void findbiggestsmallest(int[] a) {

        int biggest = a[0];
        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > biggest) {
                biggest = a[i];
            }

            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Biggest Element = " + biggest);
        System.out.println("Smallest Element = " + smallest);
    }

    public static void main(String[] args) {

        int[] a = {45, 12, 89, 23, 5, 67};

        findbiggestsmallest(a);
    }
}

package exception_package;

public class ArrayIndexOutOfBound_Exception {

    public static void main(String[] args) {

        // ---- Example 1: try executes ----
        try {
            int[] arr = {10, 20, 30};
            System.out.println("TRY executed: " + arr[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("CATCH executed");
        }

        // ---- Example 2: catch executes ----
        try {
            int[] arr2 = {1, 2, 3};
            System.out.println(arr2[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("CATCH executed: " + e);
        }
    }
}

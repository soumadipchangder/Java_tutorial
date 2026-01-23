package exception_package;

public class Arithmetic_Exception {

    public static void main(String[] args) {

        // ---- Example 1: try executes (no exception) ----
        try {
            int a = 10 / 2;
            System.out.println("TRY executed: " + a);
        } catch (ArithmeticException e) {
            System.out.println("CATCH executed");
        }

        // ---- Example 2: catch executes (exception) ----
        try {
            int b = 10 / 0;
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println("CATCH executed: " + e);
        }
    }
}

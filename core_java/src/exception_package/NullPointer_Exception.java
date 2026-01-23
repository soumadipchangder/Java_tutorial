package exception_package;

public class NullPointer_Exception {

    @SuppressWarnings("null")
	public static void main(String[] args) {

        // ---- Example 1: try executes ----
        try {
            String s = "Java";
            System.out.println("TRY executed: " + s.length());
        } catch (NullPointerException e) {
            System.out.println("CATCH executed");
        }

        // ---- Example 2: catch executes ----
        try {
            String s2 = null;
            System.out.println(s2.length());
        } catch (NullPointerException e) {
            System.out.println("CATCH executed: " + e);
        }
    }
}

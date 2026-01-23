package exception_package;

public class StringIndexOutOfBound_Exception {

    public static void main(String[] args) {

        // ---- Example 1: try executes ----
        try {
            String s = "Java";
            System.out.println("TRY executed: " + s.charAt(2));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("CATCH executed");
        }

        // ---- Example 2: catch executes ----
        try {
            String s2 = "Hi";
            System.out.println(s2.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("CATCH executed: " + e);
        }
    }
}

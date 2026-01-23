package exception_package;

public class ClassCast_Exception {

    public static void main(String[] args) {

        // ---- Example 1: try executes ----
        try {
            Object obj = "Hello";
            String s = (String) obj;   // correct casting
            System.out.println("TRY executed: " + s);
        } catch (ClassCastException e) {
            System.out.println("CATCH executed");
        }

        // ---- Example 2: catch executes ----
        try {
            Object obj2 = 10;          // Integer object
            String s2 = (String) obj2; // wrong casting
            System.out.println(s2);
        } catch (ClassCastException e) {
            System.out.println("CATCH executed: " + e);
        }
    }
}

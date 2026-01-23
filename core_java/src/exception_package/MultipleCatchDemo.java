package exception_package;

public class MultipleCatchDemo {

    @SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);      // ❌ ArrayIndexOutOfBoundsException

            String s = null;
            System.out.println(s.length()); // ❌ NullPointerException (ye line chalegi hi nahi)

            int a = 10 / 0;                  // ❌ ArithmeticException (ye bhi nahi chalega)
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled");
        }

        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception handled");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds handled");
        }

        catch (Exception e) {   // parent — last me
            System.out.println("General Exception handled");
        }

        System.out.println("Program continues...");
    }
}

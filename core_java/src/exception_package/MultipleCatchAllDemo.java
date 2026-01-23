package exception_package;

public class MultipleCatchAllDemo {

    @SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {

        // 1. Arithmetic Exception
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled");
        }

        // 2. Null Pointer Exception
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception handled");
        }

        // 3. Class Cast Exception
        try {
            Object obj = "Hello";
            Integer i = (Integer) obj;
        }
        catch (ClassCastException e) {
            System.out.println("Class Cast Exception handled");
        }

        // 4. Array Index Out Of Bounds
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception handled");
        }

        // 5. String Index Out Of Bounds
        try {
            String s2 = "Java";
            System.out.println(s2.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception handled");
        }

        System.out.println("Program continues normally...");
    }
}

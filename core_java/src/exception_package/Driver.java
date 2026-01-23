package exception_package;

public class Driver {

    @SuppressWarnings("unused")
	public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer i24 = Integer.valueOf("123"); // String -> Wrapper
        System.out.println(i24 + 1);

        int a = Integer.parseInt("123"); // String -> int

        String s = Integer.toString(123); // int -> String

        long b = Long.parseLong("567"); // String -> long  ✅ fixed

        // ---- NumberFormatException handling ----
        try {
            int c = Integer.parseInt("1A2"); // invalid number
            System.out.println(c);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception handled: " + e);
        }

        int n = 10;
        Integer i = n;    // auto boxing
        int n2 = i;       // auto unboxing
        Integer i2 = 80;  // auto boxing

        Character c1 = 'a';

        System.out.println(i2);
        System.out.println(c1);
    }
}

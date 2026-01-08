package operator;

public class Logical {
    public static void main(String[] args) {

        // Logical AND(&&)

        int a = 10, b = 5;
        boolean result1 = (a > b) && (b > 0);
        System.out.println("AND Example 1: " + result1);

        boolean result2 = (a < b) && (b > 0);
        System.out.println("AND Example 2: " + result2);


        // Logical OR(||)

        int x = 5, y = 10;
        boolean result3 = (x > y) || (y > 0);
        System.out.println("OR Example 1: " + result3);

        boolean result4 = (x > y) || (y < 0);
        System.out.println("OR Example 2: " + result4);


        //Logical NOT(!)

        boolean isRaining = true;
        boolean result5 = !isRaining;
        System.out.println("NOT Example 1: " + result5);

        boolean isLoggedIn = false;
        boolean result6 = !isLoggedIn;
        System.out.println("NOT Example 2: " + result6);
    }
}

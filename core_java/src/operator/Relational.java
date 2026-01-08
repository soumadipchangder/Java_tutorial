package operator;

public class Relational {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Greater than (>)
        boolean r1 = a > b;
        System.out.println("a > b : " + r1);

        // Less than (<)
        boolean r2 = a < b;
        System.out.println("a < b : " + r2);

        // Greater than or equal to (>=)
        boolean r3 = a >= b;
        System.out.println("a >= b : " + r3);

        // Less than or equal to (<=)
        boolean r4 = a <= b;
        System.out.println("a <= b : " + r4);

        // Equal to (==)
        boolean r5 = a == b;
        System.out.println("a == b : " + r5);

        // Not equal to (!=)
        boolean r6 = a != b;
        System.out.println("a != b : " + r6);
    }
}

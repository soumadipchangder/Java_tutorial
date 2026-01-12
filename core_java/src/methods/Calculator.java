package methods;

public class Calculator {

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        add(10, 20);          // 30
        subtract(20, 10);    // 10
        multiply(10, 20);    // 200
        divide(20, 10);      // 2
    }
}

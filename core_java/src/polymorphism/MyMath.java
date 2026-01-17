package polymorphism;

public class MyMath {
    public static void add(int a, int b) {
        System.out.println("2 int type");
        System.out.println(a + b);
    }
    public static void add(int a, int b, int c) {
        System.out.println("\n3 int type");
        System.out.println(a + b + c);
    }
    public static void add(float a, float b) {
        System.out.println("\n2 float type");
        System.out.println(a + b);
    }
    public static void add(double a, double b) {
        System.out.println("\n2 double type");
        System.out.println(a + b);
    }
    public static int add(int a, int b, int c, int d) {
        System.out.println("\n4 int type");
        return (a + b + c + d);
    }
    public void add(int a, float b) {
        System.out.println("\nint and float type (non-static)");
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        add(2, 3);
        add(1, 2, 3);
        add(2.5f, 3.5f);
        add(4.6d, 2.5d);
        int result = add(2, 3, 4, 5);
        System.out.println(result);
        MyMath m = new MyMath();
        m.add(5, 2.5f);
    }
}

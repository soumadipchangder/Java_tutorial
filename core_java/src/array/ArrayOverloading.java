package array;

public class ArrayOverloading {

    public static void show(int[] a) {
        System.out.println("Int Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void show(String[] s) {
        System.out.println("String Array:");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    public static void show(int x, String[] s) {
        System.out.println("Integer value: " + x);
        System.out.println("String Array:");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30};
        String[] s = {"Java", "AI", "ML"};

        show(a);        
        show(s);        
        show(5, s);        
    }
}

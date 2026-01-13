package methods;

public class Example3 {
    public static void main(String[] args) {
        add("abc", "def", "ghi");
    }

    public static void add(String... s) {
        String concat = "";
        for (String i : s) {
            concat = concat + i;
        }
        System.out.println("Concatenated String = " + concat);
    }
}

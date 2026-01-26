package collection_framework;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // UPCASTING

        list.add("Java");
        list.add("Python");
        list.add("C++");

        // ✅ READ element by index
        String element = list.get(1);   // index 1 -> Python
        System.out.println("Read element at index 1: " + element);

        // ✅ UPDATE element
        list.set(2, "C");   // replacing "C++" with "C"
        System.out.println("After Update: " + list);

        // ✅ DELETE element
        list.remove(0);     // removes "Java"
        System.out.println("After Delete: " + list);

        // ✅ FINAL UPDATED LIST
        System.out.println("Final Updated List: " + list);
    }
}

package collections.programs;
import java.util.*;

public class ConvertArray {
    public static void main(String[] args) {

        // Array
        String[] arr = {"a", "b", "c", "d", "e"};

        // -------- Array to List --------
        List<String> list = Arrays.asList(arr);

        System.out.println("Array to List:");
        System.out.println(list);

        // -------- List to Array --------
        String[] newArr = list.toArray(new String[0]);

        System.out.println("List to Array:");
        for (String s : newArr) {
            System.out.print(s + " ");
        }
    }
}

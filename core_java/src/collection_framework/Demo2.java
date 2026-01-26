package collection_framework;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student(10, "xyz"));
        list.add(new Student(11, "abc"));

        Student s = new Student(12, "aaa");
        list.add(s);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).id);
            System.out.println(list.get(i).name);
            System.out.println("---------------");
        }

        for (Student s2 : list) {
            System.out.println(s2.id);
            System.out.println(s2.name);
            System.out.println("***************");
        }
    }
}

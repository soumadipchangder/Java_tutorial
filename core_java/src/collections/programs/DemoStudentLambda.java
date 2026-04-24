package collections.programs;

import java.util.*;

class Student1 {
    int id;
    String name;
    double marks;

    Student1(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class DemoStudentLambda {
    public static void main(String[] args) {

        List<Student1> list = new ArrayList<>();

        list.add(new Student1(5, "Rahul", 78.5));
        list.add(new Student1(2, "Amit", 85.0));
        list.add(new Student1(4, "Neha", 72.0));
        list.add(new Student1(1, "Priya", 90.0));

        // ✅ Sorting using Lambda Expression (by ID - Ascending)
        list.sort((s1, s2) -> s1.id - s2.id);

        System.out.println("Students sorted by ID (Ascending):");
        for (Student1 s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
}

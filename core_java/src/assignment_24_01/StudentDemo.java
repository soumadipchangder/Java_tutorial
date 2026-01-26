package assignment_24_01;

import java.util.*;
class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Marks: " + marks);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Rahul", 75));
        list.add(new Student(2, "Amit", 35));
        list.add(new Student(3, "Neha", 88));
        list.add(new Student(4, "Pooja", 60));
        list.add(new Student(5, "Ravi", 30));

        System.out.println("---- All Students ----");
        for (Student s : list) {
            s.display();
        }

        System.out.println("\n---- Passed Students ----");
        for (Student s : list) {
            if (s.marks >= 40) {
                s.display();
            }
        }

        Student topper = list.get(0);

        for (Student s : list) {
            if (s.marks > topper.marks) {
                topper = s;
            }
        }

        System.out.println("\n---- Topper ----");
        topper.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (Student s : list) {
            if (s.name.equalsIgnoreCase(searchName)) {
                System.out.println("Student Found:");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        int pass = 0, fail = 0;

        for (Student s : list) {
            if (s.marks >= 40)
                pass++;
            else
                fail++;
        }

        System.out.println("\n---- Result Count ----");
        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
        sc.close();
    }
}

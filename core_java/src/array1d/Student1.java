package array1d;

import java.util.Scanner;

public class Student1 {

    int id;
    String name;
    int marks;

    public Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // -------- Create Students Using User Input --------
    public static Student1[] createStudents() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student1[] students = new Student1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Marks: ");
            int marks = sc.nextInt();

            students[i] = new Student1(id, name, marks);
        }
        sc.close();

        return students;
    }

    // -------- Filter Passed Students --------
    public static Student1[] getPassedStudents(Student1[] students, int passingMarks) {

        int count = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].marks >= passingMarks) {
                count++;
            }
        }

        Student1[] passed = new Student1[count];

        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].marks >= passingMarks) {
                passed[j++] = students[i];
            }
        }

        return passed;
    }

    // -------- Display Students --------
    public static void displayStudents(Student1[] students) {

        if (students.length == 0) {
            System.out.println("No student to display.");
            return;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                students[i].id + " " +
                students[i].name + " " +
                students[i].marks
            );
        }
    }
}

package array1d;

import java.util.Scanner;

public class StudentDriver1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passing Marks: ");
        int passingMarks = sc.nextInt();

        // create students
        Student1[] students = Student1.createStudents();

        // filter passed students
        Student1[] passed = Student1.getPassedStudents(students, passingMarks);

        // display result
        System.out.println("\nPassed Students (Marks >= " + passingMarks + "):");
        Student1.displayStudents(passed);

        sc.close();
    }
}

package collections.programs;

import java.util.*;

//Student class
class Student {
 int id;
 String name;
 double marks;

 Student(int id, String name, double marks) {
     this.id = id;
     this.name = name;
     this.marks = marks;
 }
}

//Comparator class to sort by Student ID
class SortStudentById implements Comparator<Student> {

 @Override
 public int compare(Student s1, Student s2) {
     return s1.id - s2.id;   // Ascending order by id
 }
}

//Main class
public class DemoStudent {
 public static void main(String[] args) {

     List<Student> list = new ArrayList<>();

     list.add(new Student(5, "Rahul", 78.5));
     list.add(new Student(2, "Amit", 85.0));
     list.add(new Student(4, "Neha", 72.0));
     list.add(new Student(1, "Priya", 90.0));

     // Sorting using Comparator class
     Collections.sort(list, new SortStudentById());

     System.out.println("Students sorted by ID (Ascending):");
     for (Student s : list) {
         System.out.println(s.id + " " + s.name + " " + s.marks);
     }
 }
}


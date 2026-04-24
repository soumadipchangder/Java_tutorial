package collections.programs;

import java.util.*;

//Employee class
class Employeee {
 int id;
 String name;
 double salary;

 Employeee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }
}

//Comparator class to sort by ID
class SortEmployeeeById implements Comparator<Employeee> {

 @Override
 public int compare(Employeee e1, Employeee e2) {
     return e1.id - e2.id;   // Ascending order
 }
}

//Main class
public class DemoEmployeee {
 public static void main(String[] args) {

     List<Employeee> list = new ArrayList<>();

     list.add(new Employeee(105, "Dinga", 50000));
     list.add(new Employeee(101, "Dingi", 45000));
     list.add(new Employeee(103, "Dunga", 48000));
     list.add(new Employeee(102, "Dungi", 47000));

     // Sorting using Comparator class
     Collections.sort(list, new SortEmployeeeById());

     System.out.println("Employees sorted by ID (Ascending):");
     for (Employeee e : list) {
         System.out.println(e.id + " " + e.name + " " + e.salary);
     }
 }
}

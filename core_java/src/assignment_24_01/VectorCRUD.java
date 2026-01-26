package assignment_24_01;

import java.util.Vector;

public class VectorCRUD {
    public static void main(String[] args) {

        Vector<Employee1> v = new Vector<>();

        // CREATE
        v.add(new Employee1(1, "Rahul"));
        v.add(new Employee1(2, "Amit"));
        v.add(new Employee1(3, "Neha"));

        // READ
        System.out.println("Vector Data:");
        for (Employee1 e : v) {
            System.out.println(e);
        }

        // UPDATE
        v.set(2, new Employee1(3, "Neha Updated"));

        // DELETE
        v.remove(1);

        System.out.println("After Update & Delete:");
        for (Employee1 e : v) {
            System.out.println(e);
        }
    }
}

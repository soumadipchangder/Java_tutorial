package assignment_24_01;

import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList<Employee1> list = new LinkedList<>();

        // CREATE
        list.add(new Employee1(1, "Rahul"));
        list.add(new Employee1(2, "Amit"));
        list.add(new Employee1(3, "Neha"));

        // READ
        System.out.println("All Employees:");
        for (Employee1 e : list) {
            System.out.println(e);
        }

        // UPDATE
        list.set(1, new Employee1(2, "Amit Updated"));

        // DELETE
        list.remove(0);

        System.out.println("After Update & Delete:");
        for (Employee1 e : list) {
            System.out.println(e);
        }
    }
}


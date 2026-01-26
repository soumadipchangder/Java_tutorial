package assignment_24_01;

import java.util.Stack;

public class StackCRUD {
    public static void main(String[] args) {

        Stack<Employee1> stack = new Stack<>();

        // CREATE (push)
        stack.push(new Employee1(1, "Rahul"));
        stack.push(new Employee1(2, "Amit"));
        stack.push(new Employee1(3, "Neha"));

        // READ
        System.out.println("Stack Elements:");
        for (Employee1 e : stack) {
            System.out.println(e);
        }

        // UPDATE (using index)
        stack.set(1, new Employee1(2, "Amit Updated"));

        // DELETE (pop removes top)
        stack.pop(); // removes Neha

        System.out.println("After Update & Delete:");
        for (Employee1 e : stack) {
            System.out.println(e);
        }
    }
}

package stack;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack elements: " + stack);

        System.out.println("\nUsing for loop:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }

        System.out.println("\nUsing for-each loop:");
        for (int x : stack) {
            System.out.println(x);
        }

        System.out.println("\nUsing while loop (peek):");
        int i = 0;
        while (i < stack.size()) {
            System.out.println(stack.get(i));
            i++;
        }

        System.out.println("\nUsing while loop (pop - LIFO):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

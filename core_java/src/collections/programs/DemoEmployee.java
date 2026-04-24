package collections.programs;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class DemoEmployee {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(103, "Amit", 45000));
        list.add(new Employee(101, "Rahul", 60000));
        list.add(new Employee(105, "Neha", 55000));
        list.add(new Employee(102, "Priya", 50000));

        Collections.sort(list, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.id - e2.id;
            }
        });

        System.out.println("Employees sorted by ID (Ascending):");
        for (Employee e : list) {
            System.out.println(e.id + "  " + e.name + "  " + e.salary);
        }
    }
}

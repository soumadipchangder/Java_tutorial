package assignment_24_01;

import java.util.ArrayList;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + department + " " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Rahul", "Development", 600000));
        list.add(new Employee(2, "Amit", "Testing", 550000));
        list.add(new Employee(3, "Neha", "Development", 450000));
        list.add(new Employee(4, "Pooja", "Development", 800000));
        list.add(new Employee(5, "Ravi", "HR", 700000));

        System.out.println("Employees from Development with salary > 5 Lakh:");

        for (Employee e : list) {
            if (e.department.equalsIgnoreCase("Development") && e.salary > 500000) {
                e.display();
            }
        }
    }
}


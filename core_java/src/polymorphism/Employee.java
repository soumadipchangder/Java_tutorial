//Constructor overloading and Constructor Chaining....

package polymorphism;

public class Employee {
    int id;
    String name;
    String department;
    double salary;
    public Employee(int id) {
        this.id = id;
    }
    public Employee(int id, String name) {
        this(id);              
        this.name = name;
    }
    public Employee(int id, String name, String department) {
        this(id, name);      
        this.department = department;
    }
    public Employee(int id, String name, String department, double salary) {
        this(id, name, department);
        this.salary = salary;
    }
    public void printEmployee() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        e1.printEmployee();
        Employee e2 = new Employee(102, "Rahul");
        e2.printEmployee();
        Employee e3 = new Employee(103, "Amit", "IT");
        e3.printEmployee();
        Employee e4 = new Employee(104, "Soumyadip", "AI", 450000);
        e4.printEmployee();
    }
}

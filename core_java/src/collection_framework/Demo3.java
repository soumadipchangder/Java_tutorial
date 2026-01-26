package collection_framework;
import java.util.*;

public class Demo3 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Amit", "Development", 600000));
        list.add(new Employee(102, "Ravi", "Testing", 450000));
        list.add(new Employee(103, "Neha", "Development", 800000));
        list.add(new Employee(104, "Pooja", "HR", 700000));
        
        List<Employee> devList = EmployeeService.findEmpByDep(list, "Development");
        System.out.println("Development Employees:");
        for (Employee e : devList) {
            System.out.println(e);
        }

        List<Employee> highSalary = EmployeeService.findEmpBySalary(list, 500000);
        System.out.println("\nEmployees with salary > 5 lakh:");
        for (Employee e : highSalary) {
            System.out.println(e);
        }
    }
}

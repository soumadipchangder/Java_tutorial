package array1d;

public class EmployeeDriver {

    public static void main(String[] args) {

        Employee[] employees = {
            new Employee(1, "Virat", 80000, "IT", 5),
            new Employee(2, "Rohit", 60000, "HR", 3),
            new Employee(3, "Dhoni", 120000, "IT", 10),
            new Employee(4, "Rahul", 50000, "HR", 2),
            new Employee(5, "Hardik", 90000, "Finance", 6)
        };

        EmployeeService service = new EmployeeServiceImp();

        System.out.println("High Salary Employees >= 70000");
        Employee[] high = service.getHighSalaryEmployees(employees, 70000);
        for (Employee e : high) {
            System.out.println(e.id + " " + e.name);
        }

        System.out.println("\nAverage Salary: " + service.calculateAverageSalary(employees));

        Employee top = service.getTopPaidEmployee(employees);
        System.out.println("\nTop Paid Employee: " + top.name);

        System.out.println("\nExperienced Employees (>=5 years):");
        Employee[] exp = service.getExperiencedEmployees(employees, 5);
        for (Employee e : exp) {
            System.out.println(e.name + " " + e.experience);
        }

        Employee deptTop = service.getTopPaidEmployeeByDepartment(employees, "IT");
        System.out.println("\nTop Paid in IT: " + deptTop.name);

        double avgDept = service.getAverageSalaryByDepartment(employees, "HR");
        System.out.println("\nAverage Salary in HR: " + avgDept);
    }
}

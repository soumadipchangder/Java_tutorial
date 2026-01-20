package array1d;

public class EmployeeDriver {

    public static void main(String[] args) {

        Employee[] employees = {
            new Employee(1, "Virat", 80000),
            new Employee(2, "Rohit", 60000),
            new Employee(3, "Dhoni", 120000),
            new Employee(4, "Rahul", 50000)
        };

        EmployeeService service = new EmployeeServiceImp();

        System.out.println("High Salary Employees (>= 70000):");
        Employee[] high = service.getHighSalaryEmployee(employees, 70000);

        for (int i = 0; i < high.length; i++) {
            System.out.println(high[i].id + " " + high[i].name + " " + high[i].salary);
        }

        double avg = service.calculateAverageSalary(employees);
        System.out.println("\nAverage Salary: " + avg);

        Employee top = service.getTopPaidEmployee(employees);
        System.out.println("\nTop Paid Employee:");
        System.out.println(top.id + " " + top.name + " " + top.salary);
    }
}


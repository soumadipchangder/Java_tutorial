package test;

interface Payroll {
    double calculatePayroll();
    double calculatePayroll(int monthDays);
}

@SuppressWarnings("serial")
class UnauthorizedAccessException extends RuntimeException {
    public UnauthorizedAccessException(String msg) {
        super(msg);
    }
}

@SuppressWarnings("serial")
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String msg) {
        super(msg);
    }
}

abstract class Employee implements Payroll {

    private int empId;
    private String name;
    private String role;
    private double salary;

    public Employee(int empId, String name, String role, double salary)
            throws InvalidSalaryException {

        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be greater than 0");
        }

        this.empId = empId;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void setSalary(String userRole, double salary)
            throws InvalidSalaryException {

        if (!userRole.equalsIgnoreCase("HR")) {
            throw new UnauthorizedAccessException("Only HR can modify salary!");
        }

        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be greater than 0");
        }

        this.salary = salary;
    }

    protected double getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Role: " + role);
    }
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, String role, double salary)
            throws InvalidSalaryException {
        super(id, name, role, salary);
    }

    @Override
    public double calculatePayroll() {
        return getSalary();
    }

    @Override
    public double calculatePayroll(int monthDays) {
        return (getSalary() / 30) * monthDays;
    }
}

class ContractEmployee extends Employee {

    private int hoursWorked;
    private double ratePerHour;

    public ContractEmployee(int id, String name, String role, double salary,
                            int hoursWorked, double ratePerHour)
            throws InvalidSalaryException {

        super(id, name, role, salary);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculatePayroll() {
        return hoursWorked * ratePerHour;
    }

    @Override
    public double calculatePayroll(int monthDays) {
        return hoursWorked * ratePerHour;
    }
}

public class EmployeePayrollSystem {

    static void updateSalary(Employee e, String role, double salary)
            throws InvalidSalaryException {
        e.setSalary(role, salary);
    }

    public static void main(String[] args) {

        try {

            Employee e1 = new FullTimeEmployee(101, "Rahul", "Developer", 50000);
            Employee e2 = new ContractEmployee(102, "Amit", "Tester", 1000, 120, 300);

            System.out.println("\nEmployee Details:");
            e1.display();
            e2.display();

            System.out.println("\nPayroll:");
            System.out.println(e1.getName() + " Full Month: " + e1.calculatePayroll());
            System.out.println(e1.getName() + " 15 Days: " + e1.calculatePayroll(15));

            System.out.println(e2.getName() + " Salary: " + e2.calculatePayroll());
            System.out.println(e2.getName() + " Salary (Overloaded): " + e2.calculatePayroll(20));

            System.out.println("\nSalary Update Attempts:");

            updateSalary(e1, "HR", 60000);
            System.out.println("Updated " + e1.getName() + " Salary: " + e1.calculatePayroll());

            updateSalary(e2, "Developer", 40000);

        }
        catch (InvalidSalaryException e) {
            System.out.println("Invalid Salary Error: " + e.getMessage());
        }
        catch (UnauthorizedAccessException e) {
            System.out.println("Access Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Other Error: " + e);
        }
        finally {
            System.out.println("\nSystem Execution Completed.");
        }
    }
}

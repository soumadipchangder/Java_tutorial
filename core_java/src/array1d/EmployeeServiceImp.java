package array1d;

public class EmployeeServiceImp implements EmployeeService {

    @Override
    public Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary) {

        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary >= minSalary) {
                count++;
            }
        }

        Employee[] result = new Employee[count];
        int j = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary >= minSalary) {
                result[j++] = employees[i];
            }
        }

        return result;
    }

    @Override
    public double calculateAverageSalary(Employee[] employees) {

        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].salary;
        }
        return sum / employees.length;
    }

    @Override
    public Employee getTopPaidEmployee(Employee[] employees) {

        Employee top = employees[0];

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary > top.salary) {
                top = employees[i];
            }
        }
        return top;
    }

    // ---------------- ASSIGNMENT METHODS ----------------

    // 1. Experienced Employees
    @Override
    public Employee[] getExperiencedEmployees(Employee[] employees, int minYears) {

        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].experience >= minYears) {
                count++;
            }
        }

        Employee[] result = new Employee[count];
        int j = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].experience >= minYears) {
                result[j++] = employees[i];
            }
        }

        return result;
    }

    // 2. Top Paid Employee by Department
    @Override
    public Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department) {

        Employee top = null;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].department.equalsIgnoreCase(department)) {

                if (top == null || employees[i].salary > top.salary) {
                    top = employees[i];
                }
            }
        }
        return top;
    }

    // 3. Average Salary by Department
    @Override
    public double getAverageSalaryByDepartment(Employee[] employees, String department) {

        double sum = 0;
        int count = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].department.equalsIgnoreCase(department)) {
                sum += employees[i].salary;
                count++;
            }
        }

        if (count == 0)
            return 0;

        return sum / count;
    }
}

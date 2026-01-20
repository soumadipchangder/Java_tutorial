package array1d;

public class EmployeeServiceImp implements EmployeeService {

    @Override
    public Employee[] getHighSalaryEmployee(Employee[] employees, double minSalary) {

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
}

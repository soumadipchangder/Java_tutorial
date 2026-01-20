package array1d;

interface EmployeeService {

    Employee[] getHighSalaryEmployee(Employee[] employees, double minSalary);

    double calculateAverageSalary(Employee[] employees);

    Employee getTopPaidEmployee(Employee[] employees);
}

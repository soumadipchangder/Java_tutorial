package array1d;

interface EmployeeService {

    Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary);

    double calculateAverageSalary(Employee[] employees);

    Employee getTopPaidEmployee(Employee[] employees);

    // assignment
    Employee[] getExperiencedEmployees(Employee[] employees, int minYears);

    Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department);

    double getAverageSalaryByDepartment(Employee[] employees, String department);
}

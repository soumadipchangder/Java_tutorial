package collection_framework;
import java.util.*;

public class EmployeeService {

    public static List<Employee> findEmpByDep(List<Employee> employees, String dep) {

        List<Employee> result = new ArrayList<>();

        for (Employee e : employees) {
            if (e.department.equalsIgnoreCase(dep)) {
                result.add(e);
            }
        }
        return result;
    }

    public static List<Employee> findEmpBySalary(List<Employee> employees, double salary) {

        List<Employee> result = new ArrayList<>();

        for (Employee e : employees) {
            if (e.salary > salary) {
                result.add(e);
            }
        }
        return result;
    }
}

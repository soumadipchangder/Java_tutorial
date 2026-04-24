package ColleectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		ArrayList<Employee>emp= new ArrayList<Employee>();
		emp.add(new Employee(10,"abc",15236));
		emp.add(new Employee(17,"bc",15636));
		emp.add(new Employee(13,"c",11236));
		emp.add(new Employee(1,"zsd",19936));
		
		Collections.sort(emp,new SortEmployeebyId());
		System.out.println(emp);
		
		Collections.sort(emp,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(emp);
	}

}
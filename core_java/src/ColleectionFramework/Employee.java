package ColleectionFramework;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Employee {

	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: "+id+" name: "+name;
	}

}

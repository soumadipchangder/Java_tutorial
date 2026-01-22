package object_class;

public class Employee {
	
	int id;
	String name;
	float salary;
	String department;
	public Employee(int id, String name, float salary, String department) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	@Override
	public String toString() {
	    return "Employee [id=" + id + ", name=" + name +
	           ", salary=" + salary + ", department=" + department + "]";
	}

	public static void main(String[] args) {
		Employee e =new Employee(101,"Dinga",100000,"Forest");
		System.out.println(e);
	}
	

}

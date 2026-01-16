package super_example2;

public class Employee extends Human {
	int id;
	long salary;
	public Employee(String name,int age,char gender,int id,long salary) {
		super(name,age,gender);
		this.id=id;
		this.salary=salary;
	}
	public static void main(String[] args) {
		Employee e=new Employee("Dinga",21,'M',21,100000);
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.gender);
		System.out.println(e.id);
		System.out.println(e.salary);
	}

}

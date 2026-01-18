package abstraction;

public abstract class Employee {
	int id;
	String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Employee() {
		
	}
	public abstract void printEmployee();
	
	public static void main(String[] args) {
		Raju r=new Raju(10,"Raju",1000000.0);
		r.printEmployee();
		Employee e=new Raju(10,"Raju",1000000.0);
		e.printEmployee();
	}

}
class Raju extends Employee{
	double salary;
	
	public Raju(int id,String name,double salary) {
		super(id,name);
		this.salary=salary;
	}
	
	@Override
	public void printEmployee() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
		
	}
	
	
}

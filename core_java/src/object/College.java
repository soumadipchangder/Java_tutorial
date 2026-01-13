package object;

public class College {
	String name;
	String location;
	int placement;
	
	public void exam() {
		System.out.println(name+ " "+location+" is taking the exam");
	}
	public void printEmployee() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(placement);
	}
	public static void main(String[] args) {
		College c1=new College();
		c1.name="IEM";
		c1.location="Kolkata";
		c1.placement=100;
		c1.printEmployee();
		c1.exam();
	}

}

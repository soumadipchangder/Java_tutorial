package super_example2;

public class Student extends Human {
	int percentage;
	public Student(String name,int age,char gender,int percentage) {
		super(name,age,gender);
		this.percentage=percentage;
	}
	public static void main(String[] args) {
		Student s=new Student("Dingi",20,'F',95);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.gender);
		System.out.println(s.percentage);
	}

}

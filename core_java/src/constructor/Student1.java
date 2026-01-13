
/*
===========================================
||     CONSTRUCTOR  OVERLOADING  DEMO     ||
===========================================
*/

package constructor;
public class Student1 {
	int id;
	String name;

	public Student1() {
		System.out.println("Constructor");
	}
	public Student1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.display();
		Student1 s2=new Student1(10,"Raju");
		s2.display();
	}

}

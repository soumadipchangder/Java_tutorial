/*
===========================================
||     Non-Static      CONSTRUCTOR       ||
===========================================
*/

package constructor;

public class Student {
	int id;
	String name;

	public Student() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();

	}

}

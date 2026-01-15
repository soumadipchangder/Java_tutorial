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
		new Student();
		new Student();
		new Student();

	}

}

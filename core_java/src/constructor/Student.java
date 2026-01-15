/*
===========================================
||     Non-Static      CONSTRUCTOR       ||
===========================================
*/

package constructor;

public class Student {
	@SuppressWarnings("unused")
	int id;
	@SuppressWarnings("unused")
	String name;

	public Student() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student s1 = new Student();
		@SuppressWarnings("unused")
		Student s2 = new Student();
		@SuppressWarnings("unused")
		Student s3 = new Student();

	}

}

package object;

class Student {
	int id;
	String name;
	public void study() {
		System.out.println("Studying");
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("Student id: "+s.id);
		System.out.println("Student name: "+s.name);
		s.id=179;
		s.name="Soumyadip";
		System.out.println("Student id: "+s.id);
		System.out.println("Student name: "+s.name);
		s.study();
		System.out.println(s);
	}

}

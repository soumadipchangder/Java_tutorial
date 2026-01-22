package object_class.hashcode;

import java.util.Objects;
 
public class Student {
	int id;
	String name;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	public static void main(String[] args) {
		Student s1=new Student(10,"Dinga");
		Student s2=new Student(11,"Dingi");
		Student s3=s1;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
	}

}

package object_class;

public class Person {
	
	String name;
	int id;
	
	Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "id:"+id+" name:"+name;
	}
	public static void main(String[] args) {
		Person p =new Person(10,"XYZ");
		System.out.println(p);
		System.out.println(p.toString());
	}

}

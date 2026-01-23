package exception_package;

public class Class_forName {
	public static void main(String[] args) {
		System.out.println("hii");
		try {
			Class.forName("array1d.Studen");
		} catch (ClassNotFoundException e) { 
			System.out.println("class info is wrong");
		}
		System.out.println("bye");
	}

}

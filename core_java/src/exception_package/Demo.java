package exception_package;

public class Demo {
	public static void main(String[] args) {
		try {
			System.out.println(7/0);
		}catch(Exception e){
			System.out.println("exception handled");
		}finally {
			System.out.println("finally block");
			//closing DB connection
		}
	}

}

package exception_package;

public class Sleep_method {
	public static void main(String[] args) {
		System.out.println("hii");
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println("Sleep Method Called");
		}
		System.out.println("bye");
	}

}

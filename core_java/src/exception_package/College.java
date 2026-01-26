package exception_package;

public class College {
	public Day day;
	static int a=10;
	static class Student{
		public static void m1() {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Student.m1();
		College c =new College();
		c.day=Day.mon;
		System.out.println(c.day);
	}

}

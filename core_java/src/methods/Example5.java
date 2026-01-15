package methods;

class Student {
}
public class Example5 {
    static Student s1; //static
    Student s2; //non static
    public static void main(String[] args) {
        System.out.println(s1);
        Example5 e = new Example5();
        e.s2=new Student();
        System.out.println(e.s2);
    }
}

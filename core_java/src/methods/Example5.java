package methods;

class StudentEx5 {
}
public class Example5 {
    static StudentEx5 s1; //static
    StudentEx5 s2; //non static
    public static void main(String[] args) {
        System.out.println(s1);
        Example5 e = new Example5();
        e.s2=new StudentEx5();
        System.out.println(e.s2);
    }
}

package object_class.hashcode;

public class CompareStudent {
    int id;
    String name;

    public CompareStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean compareStudent(CompareStudent s) {
        if (this.id == s.id && this.name.equals(s.name)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CompareStudent s1 = new CompareStudent(10, "Dinga");
        CompareStudent s2 = new CompareStudent(10, "Dinga");
        CompareStudent s3 = new CompareStudent(11, "Dingi");

        System.out.println(s1.compareStudent(s2)); // true
        System.out.println(s1.compareStudent(s3)); // false
    }
}

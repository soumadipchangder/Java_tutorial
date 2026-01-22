package object_class;

import java.util.Objects;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
//        if (this.id==s.id && this.name==s.name) {
//        	return true;
//        }
//        return false;
        return this.id==s.id && this.name==s.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "Dinga");
        Student s2 = new Student(11, "Dinga");
        Student s3 = s1;

        System.out.println(s1.equals(s2)); // true (data same)
        System.out.println(s1.equals(s3)); // true (same object)
    }
}


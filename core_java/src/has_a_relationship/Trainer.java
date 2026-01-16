package has_a_relationship;

public class Trainer {

    private String name;
    private String subject;

    private Student student;   // HAS-A
    private College college;   // HAS-A

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void printTrainerInfo() {
        System.out.println("Name    : " + name);
        System.out.println("Subject : " + subject);
        System.out.println("Student : " + student.getClass().getSimpleName());
        System.out.println("College : " + college.getName());
    }
}

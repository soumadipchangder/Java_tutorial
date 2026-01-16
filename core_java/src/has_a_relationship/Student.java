package has_a_relationship;

public class Student {

    private int id;
    private String name;

    private College college;   // HAS-A
    private Trainer trainer;   // HAS-A

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void printStudentInfo() {
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("College : " + college.getName());
        System.out.println("Trainer : " + trainer.getName());
    }
}

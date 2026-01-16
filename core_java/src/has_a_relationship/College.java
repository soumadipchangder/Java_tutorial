package has_a_relationship;

public class College {

    private String name;
    private String location;

    private Student student;   // HAS-A
    private Trainer trainer;   // HAS-A

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public void printCollegeInfo() {
        System.out.println("---- College Info ----");
        System.out.println("Name     : " + name);
        System.out.println("Location : " + location);

        System.out.println("\n---- Student Info ----");
        student.printStudentInfo();

        System.out.println("\n---- Trainer Info ----");
        trainer.printTrainerInfo();
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {

        College c = new College();
        c.setName("IEM Kolkata");
        c.setLocation("Salt Lake");

        Student s = new Student();
        s.setId(101);
        s.setName("Soumyadip");

        Trainer t = new Trainer();
        t.setName("Sandeep Chavan Sir");
        t.setSubject("Java");

        // Linking HAS-A relations
        c.setStudent(s);
        c.setTrainer(t);

        s.setCollege(c);
        s.setTrainer(t);

        t.setStudent(s);
        t.setCollege(c);

        // Print all info
        c.printCollegeInfo();
    }
}

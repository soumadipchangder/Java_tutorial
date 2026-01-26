package assignment_24_01;

interface Staff {
    void work();
}

class Clerk implements Staff {
    public void work() {
        System.out.println("Clerk handles office files.");
    }
}

class Accountant implements Staff {
    public void work() {
        System.out.println("Accountant manages college accounts.");
    }
}

class Librarian implements Staff {
    public void work() {
        System.out.println("Librarian manages library books.");
    }
}

public class College {

    class Student {

        enum Mode { ONLINE, OFFLINE }
        enum Gender { MALE, FEMALE }

        int id;
        String name;
        Mode mode;
        Gender gender;

        Student(int id, String name, Mode mode, Gender gender) {
            this.id = id;
            this.name = name;
            this.mode = mode;
            this.gender = gender;
        }

        void display() {
            System.out.println("Student ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Mode: " + mode);
            System.out.println("Gender: " + gender);
        }
    }

    class Trainer {
        int id;
        String name;
        String subject;

        Trainer(int id, String name, String subject) {
            this.id = id;
            this.name = name;
            this.subject = subject;
        }

        void display() {
            System.out.println("Trainer ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Subject: " + subject);
        }
    }

    public static void main(String[] args) {

        College college = new College();

        College.Student s1 =
            college.new Student(1, "Rahul",
                College.Student.Mode.ONLINE,
                College.Student.Gender.MALE);

        System.out.println("---- Student Details ----");
        s1.display();

        College.Trainer t1 =
            college.new Trainer(101, "Neha", "Java");

        System.out.println("\n---- Trainer Details ----");
        t1.display();

        Staff st1 = new Clerk();
        Staff st2 = new Accountant();
        Staff st3 = new Librarian();

        System.out.println("\n---- Staff Work ----");
        st1.work();
        st2.work();
        st3.work();
    }
}

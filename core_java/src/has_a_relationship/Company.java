package has_a_relationship;

public class Company {
    Employee e = new Employee();   // HAS-A relationship

    public void startWork() {
        e.work();
    }

    public static void main(String[] args) {
        Company c = new Company();
        c.startWork();
    }
}


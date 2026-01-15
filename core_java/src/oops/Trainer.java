package oops;

public class Trainer {
    private String name;
    private int id;
    private long pass;
    // getters
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public long getPass() {
        return pass;
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPass(long pass) {
        this.pass = pass;
    }
    // main method to test
    public static void main(String[] args) {
        Trainer t = new Trainer();
        t.setName("Rahul");
        t.setId(101);
        t.setPass(987654);
        System.out.println("Name : " + t.getName());
        System.out.println("ID   : " + t.getId());
        System.out.println("Pass : " + t.getPass());
    }
}


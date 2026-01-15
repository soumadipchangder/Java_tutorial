package oops;

public class Encapsulation {
    String name;
    private int pass;
    public int getPass() {
        return pass;
    }
    public void setPass(int pass) {
        this.pass = pass;
    }
    public static void main(String[] args) {
        Encapsulation s = new Encapsulation();
        s.name = "Raju";
        s.setPass(1234);
        System.out.println("Name: " + s.name);
        System.out.println("Password: " + s.getPass());
    }
}

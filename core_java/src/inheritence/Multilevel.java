package inheritence;

public class Multilevel {
    String type = "Animal";

    public void eat() {
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}

class Dog extends Multilevel {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}

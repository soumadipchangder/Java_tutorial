package Inheritence;

public class Animal {
    String type = "Animal";

    public void eat() {
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();        // from Animal
        p.bark();       // from Dog
        p.weep();       // from Puppy
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}

package interface_demo;

interface Animal {
    void sound();
    void color();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void color() {
        System.out.println("Dog is brown");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void color() {
        System.out.println("Cat is white");
    }
}

class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("Cow moos");
    }

    @Override
    public void color() {
        System.out.println("Cow is black and white");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();
        a1.color();

        System.out.println();

        a2.sound();
        a2.color();

        System.out.println();

        a3.sound();
        a3.color();
    }
}

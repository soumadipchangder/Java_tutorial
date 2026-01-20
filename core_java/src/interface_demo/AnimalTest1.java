package interface_demo;

interface Animal1 {
 void sound();
 void eat();
}

class Dog1 implements Animal1 {
 public void sound() {
     System.out.println("Dog barks");
 }

 public void eat() {
     System.out.println("Dog eats bones");
 }

 // Own method
 public void guard() {
     System.out.println("Dog is guarding the house");
 }
}

//Child class 2
class Cat1 implements Animal1 {
 public void sound() {
     System.out.println("Cat meows");
 }

 public void eat() {
     System.out.println("Cat eats fish");
 }

 public void jump() {
     System.out.println("Cat is jumping");
 }
}

//Main class
public class AnimalTest1 {
 public static void main(String[] args) {

     // 🔹 UPCASTING (automatic)
     Animal1 a = new Dog1();   // Dog → Animal
     a.sound();              // Dog version
     a.eat();

     // a.guard(); ❌ Not allowed (reference is Animal)

     System.out.println("------ Downcasting ------");

     // 🔹 DOWNCASTING (manual)
     Dog1 d = (Dog1) a;        // Animal → Dog
     d.sound();
     d.eat();
     d.guard();              // Now allowed

     System.out.println("------ Wrong Downcasting ------");

     Animal1 a2 = new Cat1();

     // Dog1 d2 = (Dog1) a2;   ❌ Runtime Error: ClassCastException
     // because Cat is not Dog

     Cat1 c = (Cat1) a2;       // correct DOWNCASTING
     c.jump();
 }
}

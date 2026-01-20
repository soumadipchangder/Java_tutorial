package interface_demo;

interface Mobile {
 void call();
 void internet();
}

interface Laptop {
 void coding();
 void browsing();
}

interface Pet{
	void type();
	void breed();
}

class IPhone implements Mobile {
 @Override
 public void call() {
     System.out.println("Hey Siri,Call Dinga.");
 }

 @Override
 public void internet() {
     System.out.println("Dinga,Internet on Iphone is very fast re.");
 }
}

class Macbook implements Laptop {
 @Override
 public void coding() {
     System.out.println("Coding on Macbook is fun.");
 }

 @Override
 public void browsing() {
     System.out.println("Dinga,Macbook browsing is fast and reliable re.");
 }
}

class Doggy implements Pet{
	@Override
	public void type() {
		System.out.println("Arey Dinga, I bought a Doggy re.");
	}
	@Override
	public void breed() {
		System.out.println("It is a German Shepherd.");
	}
}

class Person {
 private String name;
 private Mobile mobile;
 private Laptop laptop;
 private Pet pet;

 public Person(String name, Mobile mobile, Laptop laptop, Pet pet) {
     this.name = name;
     this.mobile = mobile;
     this.laptop = laptop;
     this.pet=pet;
 }

 public void useDevices() {
     System.out.println("Person Name: " + name);

     mobile.call();
     mobile.internet();

     laptop.coding();
     laptop.browsing();
     
     pet.type();
     pet.breed();
 }
}

public class MainApp {
 public static void main(String[] args) {

     Mobile m = new IPhone();
     Laptop l = new Macbook();
     Pet d=new Doggy();

     Person p = new Person("Soumyadip", m, l, d);

     p.useDevices();
 }
}

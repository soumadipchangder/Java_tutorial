package polymorphism;

class Parent3 {
    static void show() {
        System.out.println("Parent show()");
    }
}

class Child3 extends Parent3 {
    static void show() {
        System.out.println("Child show()");
    }
}

public class MethodHiding {
    @SuppressWarnings("static-access")
	public static void main(String[] args) {

        Parent3 p = new Child3();
        p.show();      // Parent show()

        Child3 c = new Child3();
        c.show();      // Child show()
    }
}


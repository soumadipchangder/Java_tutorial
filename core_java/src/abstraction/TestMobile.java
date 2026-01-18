package abstraction;

abstract class Mobile {

    abstract void camera();
    abstract void battery();
    abstract void smartFeature();
}
abstract class Redmi1 extends Mobile {

    @Override
    void camera() {
        System.out.println("Redmi1: 12MP Camera");
    }
}

abstract class Redmi2 extends Redmi1 {

    @Override
    void battery() {
        System.out.println("Redmi2: 4500mAh Battery");
    }
}

class Redmi3 extends Redmi2 {

    @Override
    void smartFeature() {
        System.out.println("Redmi3: AI Face Unlock & Smart Camera");
    }
}

public class TestMobile {
    public static void main(String[] args) {

        Mobile m = new Redmi3();   // UPCASTING
        m.camera();
        m.battery();
        m.smartFeature();
    }
}
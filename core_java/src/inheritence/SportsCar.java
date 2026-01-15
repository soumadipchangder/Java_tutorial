package inheritence;

interface MusicSystem {
    void playMusic();
}

class Vehicle1 {
    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car_1 extends Vehicle1 implements MusicSystem {

    public void drive() {
        System.out.println("Car is driving");
    }

    public void playMusic() {
        System.out.println("Music is playing in car");
    }
}

public class SportsCar extends Car_1 {

    public void turbo() {
        System.out.println("Turbo mode ON");
    }

    public static void main(String[] args) {
        SportsCar s = new SportsCar();

        s.start();
        s.playMusic();
        s.drive();
        s.turbo();
    }
}

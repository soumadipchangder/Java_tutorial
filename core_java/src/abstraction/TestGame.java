package abstraction;

abstract class Game {
	
    abstract void start();
    abstract void end();

    void play() {
        System.out.println("Game is about to start...");
        start();
        System.out.println("Game is running...");
        end();
        System.out.println("Game finished.");
    }
}

class Cricket extends Game {

    @Override
    void start() {
        System.out.println("India won the toss and decided to bat first.");
    }

    @Override
    void end() {
        System.out.println("Dhoni finishes off in style.");
    }
}

class Football extends Game {

    @Override
    void start() {
        System.out.println("Come on India.Let's Football.");
    }

    @Override
    void end() {
        System.out.println("That's another win for team India.");
    }
}

public class TestGame {

    public static void main(String[] args) {

        Game g1 = new Cricket();   // UPCASTING
        g1.play();

        System.out.println("-----------");

        Game g2 = new Football();  // UPCASTING
        g2.play();
    }
}

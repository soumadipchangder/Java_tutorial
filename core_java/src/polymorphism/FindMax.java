package polymorphism;

public class FindMax {

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int max(int a, int b, int c) {
        int m = (a > b) ? a : b;
        return (m > c) ? m : c;
    }

    public float max(int a, float b) {
        return (a > b) ? a : b;
    }

    public float max(float a, float b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        FindMax f = new FindMax();

        System.out.println("Max of 10 and 20 = " + f.max(10, 20));
        System.out.println("Max of 5, 25, 15 = " + f.max(5, 25, 15));
        System.out.println("Max of 10 and 12.5 = " + f.max(10, 12.5f));
        System.out.println("Max of 7.5 and 3.2 = " + f.max(7.5f, 3.2f));
    }
}

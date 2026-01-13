package methods;
class Example4 {
    public static void main(String[] args) {
        biggest(12.5, 45.2, 9.8, 100.75, 67.3);
    }

    public static void biggest(double... n) {

        double max = n[0];

        for (double i : n) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Biggest number = " + max);
    }
}

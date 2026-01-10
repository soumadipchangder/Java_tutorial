package assignments_while_loops;

public class Case4 {

    public static void main(String[] args) {

        int n = 12345;
        int sum = 0;
        int count = 0;
        int rem;

        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            count++;
            n = n / 10;
        }

        int avg = sum / count;

        System.out.println("Sum of digits = " + sum);
        System.out.println("Number of digits = " + count);
        System.out.println("Average of digits = " + avg);
    }
}

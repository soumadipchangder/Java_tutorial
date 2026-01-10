package assignments_while_loops;

public class Case2 {
    public static void main(String[] args) {

        int n = 12345;
        int evenCount = 0;
        int oddCount = 0;
        int rem;

        while (n > 0) {
            rem = n % 10;

            if (rem % 2 == 0)
                evenCount++;
            else
                oddCount++;

            n = n / 10;
        }

        System.out.println("Even digits = " + evenCount);
        System.out.println("Odd digits = " + oddCount);
    }
}

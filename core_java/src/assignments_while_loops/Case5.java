package assignments_while_loops;

public class Case5 {

    public static void main(String[] args) {

        int n = 1231;
        int temp = n;
        int rev = 0;
        int rem;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (rev == temp)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}

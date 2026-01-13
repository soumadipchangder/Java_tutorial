package static_example;

public class Program {
	public static void palindrome(int a) {
        int temp = a, rev = 0;

        while (a > 0) {
            int r = a % 10;
            rev = rev * 10 + r;
            a = a / 10;
        }

        if (rev == temp)
            System.out.println(temp + " is Palindrome");
        else
            System.out.println(temp + " is Not Palindrome");
    }
    public static void prime(int a) {
        int count = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println(a + " is Prime");
        else
            System.out.println(a + " is Not Prime");
    }
}


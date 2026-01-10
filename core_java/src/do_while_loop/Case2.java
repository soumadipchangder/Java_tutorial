package do_while_loop;

public class Case2 {

    public static void main(String[] args) {

        int i = 1, n = 10;
        int sum = 0;

        do {
            sum = sum + i;
            i++;
        } while (i <= n);

        System.out.println("Sum = " + sum);
    }
}


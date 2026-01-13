package static_example;

public class Driver {
    public static void main(String[] args) {

        Data d = new Data();
        d.num1 = 121;
        d.num2 = 17;

        Program.palindrome(d.num1);
        Program.prime(d.num2);
    }
}

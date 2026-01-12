package methods;

class ReversePower{

    public static int countDigits(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static int power(int r, int p) {
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * r;
        }
        return res;
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {

        int n = 1423;

        int temp = reverse(n);          // now digits come left to right
        int sum = 0;
        int power = countDigits(n);     // start from 3

        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, power);
            power--;
            temp /= 10;
        }

        System.out.println("Sum = " + sum);  // OUTPUT = 29
    }
}

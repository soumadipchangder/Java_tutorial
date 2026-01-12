package methods;

class Armstrong {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static int power(int r, int count) {
        int p = 1;
        for (int i = 1; i <= count; i++) {
            p = p * r;
        }
        return p;
        
    }
    public static boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        int count = countDigits(n);

        while (temp != 0) {
            int r = temp % 10;
            sum += power(r, count);
            temp /= 10;
        }

        return sum == n;
    }
    public static void main(String[] args) {

        int n = 153;

        if (isArmstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}

package array;

public class UpdateArrayByDigitSum {
	
    public static void DigitSum(int[] a) {

        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int sum = 0;

            while (n > 0) {
                int r = n % 10;
                sum = sum + r;
                n = n / 10;
            }

            a[i] = sum;
        }
    }

    public static void main(String[] args) {

        int[] a = {123, 45, 9, 81};

        System.out.println("Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        DigitSum(a);

        System.out.println("\nArray of Sum of Digits:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

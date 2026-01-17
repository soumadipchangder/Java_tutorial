package array;

public class DifferentArrays {

    public static void printIntArray(int[] a) {
        System.out.println("Int Array:\n");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }

    public static void printCharArray(char[] a) {
        System.out.println("\nChar Array:\n");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }

    public static void printBooleanArray(boolean[] a) {
        System.out.println("\nBoolean Array:\n");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
    public static void printStringArray(String[] a) {
        System.out.println("\nString Array:\n");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }

    public static void printFloatArray(float[] a) {
        System.out.println("\nFloat Array:\n");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }

    public static void main(String[] args) {
    	
        int[] iArr = new int[3];
        iArr[0] = 10;
        iArr[1] = 20;
        iArr[2] = 30;

        char[] cArr = new char[3];
        cArr[0] = 'A';
        cArr[1] = 'B';
        cArr[2] = 'C';

        boolean[] bArr = new boolean[3];
        bArr[0] = true;
        bArr[1] = false;
        bArr[2] = true;

        String[] sArr = new String[3];
        sArr[0] = "Java";
        sArr[1] = "AI";
        sArr[2] = "ML";

        float[] fArr = new float[3];
        fArr[0] = 1.1f;
        fArr[1] = 2.2f;
        fArr[2] = 3.3f;

        printIntArray(iArr);
        printCharArray(cArr);
        printBooleanArray(bArr);
        printStringArray(sArr);
        printFloatArray(fArr);
    }
}

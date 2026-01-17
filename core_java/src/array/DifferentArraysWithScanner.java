package array;

import java.util.Scanner;

public class DifferentArraysWithScanner {

    public static void printIntArray(int[] a) {
        System.out.println("\nInt Array:\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void printCharArray(char[] a) {
        System.out.println("\nChar Array:\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void printBooleanArray(boolean[] a) {
        System.out.println("\nBoolean Array:\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void printStringArray(String[] a) {
        System.out.println("\nString Array:\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void printFloatArray(float[] a) {
        System.out.println("\nFloat Array:\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[3];
        System.out.println("Enter 3 int values:");
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = sc.nextInt();
        }

        char[] cArr = new char[3];
        System.out.println("Enter 3 characters:");
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = sc.next().charAt(0);
        }

        boolean[] bArr = new boolean[3];
        System.out.println("Enter 3 boolean values (true/false):");
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = sc.nextBoolean();
        }

        String[] sArr = new String[3];
        System.out.println("Enter 3 strings:");
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = sc.next();
        }

        float[] fArr = new float[3];
        System.out.println("Enter 3 float values:");
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = sc.nextFloat();
        }

        printIntArray(iArr);
        printCharArray(cArr);
        printBooleanArray(bArr);
        printStringArray(sArr);
        printFloatArray(fArr);

        sc.close();
    }
}

package array;

public class Merge_array {
	
    public static int[] reverseArray(int[] arr) {

        int[] rev = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j++] = arr[i];
        }

        return rev;
    }

    public static int[] addElementInIndex(int[] arr, int ele, int index) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = ele;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static int[] replaceElementInIndex(int[] arr, int ele, int index) {

        if (index >= 0 && index < arr.length) {
            arr[index] = ele;
        }

        return arr;
    }
    public static int[] removeElementFromIndex(int[] arr, int index) {

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {

        int[] a = {3, 5};

        System.out.println("Original Array:");
        print(a);

        int[] rev = reverseArray(a);
        System.out.println("After Reverse:");
        print(rev);

        int[] add = addElementInIndex(rev, 9, 1);
        System.out.println("After Adding 9 at index 1:");
        print(add);

        int[] rep = replaceElementInIndex(add, 8, 0);
        System.out.println("After Replacing index 0 with 8:");
        print(rep);

        int[] rem = removeElementFromIndex(rep, 1);
        System.out.println("After Removing index 1:");
        print(rem);
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

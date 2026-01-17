package array;

public class RemoveDuplicate {

    public static void removeDuplicate(int[] a) {

        boolean[] visited = new boolean[a.length];

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < a.length; i++) {

            if (visited[i] == true)
                continue;

            System.out.print(a[i] + " ");

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 10, 30, 20, 40, 10};

        System.out.println("Original Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\n");

        removeDuplicate(a);
    }
}

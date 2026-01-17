package array;

public class RemoveDuplicate_newarray {

    public static int[] removeDuplicate(int[] a) {

        boolean[] visited = new boolean[a.length];

        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (visited[i] == true)
                continue;

            count++;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true;
                }
            }
        }

        int[] b = new int[count];

        visited = new boolean[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {

            if (visited[i] == true)
                continue;

            b[k++] = a[i];

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true;
                }
            }
        }

        return b;
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 10, 30, 20, 40, 10};

        System.out.println("Original Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int[] newArr = removeDuplicate(a);

        System.out.println("\nNew Array after removing duplicates:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

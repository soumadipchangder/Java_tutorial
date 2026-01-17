package array;

public class FrequencyOfElements {

    public static void printFrequency(int[] a) {

        boolean[] visited = new boolean[a.length];

        System.out.println("Element : Frequency");

        for (int i = 0; i < a.length; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(a[i] + " : " + count);
        }
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 10, 30, 20, 10};

        printFrequency(a);
    }
}

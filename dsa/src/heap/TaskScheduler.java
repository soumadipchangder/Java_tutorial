package heap;

public class TaskScheduler {

    public static void main(String[] args) {
        char[] tasks = {'A','C','A','B','D','B'};
        System.out.println(leastInterval(tasks, 2));
    }

    private static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char c : tasks) {
            freq[c - 'A']++;
        }

        int maxFreq = 0;
        int countMax = 0;

        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
                countMax = 1;
            } else if (f == maxFreq) {
                countMax++;
            }
        }

        int partCount = maxFreq - 1;
        int partLength = n + 1;
        int emptySlots = partCount * partLength + countMax;

        return Math.max(tasks.length, emptySlots);
    }
}

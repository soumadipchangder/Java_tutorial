package dp;

import java.util.Arrays;

public class Maximum_sum_of_non_adjacent_elements {

    // -------------------------------
    // 1. Recursion + Memoization
    // -------------------------------
    public static int func(int arr[], int ind, int dp[]) {
        if (ind < 0) return 0;
        if (ind == 0) return arr[0];

        if (dp[ind] != -1) return dp[ind];

        int pick = arr[ind] + func(arr, ind - 2, dp);
        int notPick = func(arr, ind - 1, dp);

        dp[ind] = Math.max(pick, notPick);
        return dp[ind];
    }

    // -------------------------------
    // 2. Tabulation (Bottom-Up)
    // -------------------------------
    public static int func1(int arr[]) {
        int n = arr.length;

        if (n == 0) return 0;
        if (n == 1) return arr[0];

        int dp[] = new int[n];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            int pick = arr[i] + dp[i - 2];
            int notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }

        return dp[n - 1];
    }

    // -------------------------------
    // 3. Space Optimized Version
    // -------------------------------
    public static int func2(int arr[]) {
        int n = arr.length;

        if (n == 0) return 0;
        if (n == 1) return arr[0];

        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            int pick = arr[i] + prev2;
            int notPick = prev1;

            int curr = Math.max(pick, notPick);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    // -------------------------------
    // Main Method
    // -------------------------------
    public static void main(String[] args) {

        int arr[] = {2, 1, 4, 9};
        int n = arr.length;

        // Memoization DP array
        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        System.out.println("Recursion + Memoization: " + func(arr, n - 1, dp));
        System.out.println("Tabulation: " + func1(arr));
        System.out.println("Space Optimized: " + func2(arr));
    }
}

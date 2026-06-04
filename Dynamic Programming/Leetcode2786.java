import java.util.*;

class Leetcode2786 {

    public static void main(String[] args) {

        Leetcode2786 sol = new Leetcode2786();

        int[] nums = { 2, 3, 6, 1, 9, 2 };
        int x = 5;

        System.out.println("Recursion      : " + sol.maxScoreRecursion(nums, x));
        System.out.println("Memoization    : " + sol.maxScoreMemo(nums, x));
        System.out.println("Tabulation     : " + sol.maxScoreTabulation(nums, x));
        System.out.println("Optimal O(n)   : " + sol.maxScore(nums, x));
    }

    // =========================
    // 1. Recursion
    // =========================
    public long maxScoreRecursion(int[] nums, int x) {
        return nums[0] + recursion(0, 1, nums, x);
    }

    private long recursion(int last, int curr, int[] nums, int x) {
        if (curr == nums.length)
            return 0;

        long gain = nums[curr];

        if ((nums[last] & 1) != (nums[curr] & 1)) {
            gain -= x;
        }

        long pick = gain + recursion(curr, curr + 1, nums, x);
        long skip = recursion(last, curr + 1, nums, x);

        return Math.max(pick, skip);
    }

    // =========================
    // 2. Memoization
    // =========================
    public long maxScoreMemo(int[] nums, int x) {
        int n = nums.length;

        long[][] dp = new long[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return nums[0] + memo(0, 1, nums, x, dp);
    }

    private long memo(int last, int curr, int[] nums, int x, long[][] dp) {

        if (curr == nums.length)
            return 0;

        if (dp[last][curr] != -1) {
            return dp[last][curr];
        }

        long gain = nums[curr];

        if ((nums[last] & 1) != (nums[curr] & 1)) {
            gain -= x;
        }

        long pick = gain + memo(curr, curr + 1, nums, x, dp);
        long skip = memo(last, curr + 1, nums, x, dp);

        return dp[last][curr] = Math.max(pick, skip);
    }

    // =========================
    // 3. Tabulation
    // =========================
    public long maxScoreTabulation(int[] nums, int x) {

        int n = nums.length;

        long[][] dp = new long[n][n + 1];

        for (int i = n - 1; i >= 0; i--) {

            for (int j = n - 1; j > i; j--) {

                long gain = nums[j];

                if ((nums[i] & 1) != (nums[j] & 1)) {
                    gain -= x;
                }

                long pick = gain;

                if (j + 1 < n) {
                    pick += dp[j][j + 1];
                }

                long skip = dp[i][j + 1];

                dp[i][j] = Math.max(pick, skip);
            }
        }

        return nums[0] + dp[0][1];
    }

    // =========================
    // 4. Optimal O(n)
    // =========================
    public long maxScore(int[] nums, int x) {

        long NEG = -(long) 1e18;

        long even = NEG;
        long odd = NEG;

        if ((nums[0] & 1) == 0) {
            even = nums[0];
        } else {
            odd = nums[0];
        }

        for (int i = 1; i < nums.length; i++) {

            long prevEven = even;
            long prevOdd = odd;

            if ((nums[i] & 1) == 0) {

                even = Math.max(
                        prevEven + nums[i],
                        prevOdd + nums[i] - x);

            } else {

                odd = Math.max(
                        prevOdd + nums[i],
                        prevEven + nums[i] - x);
            }
        }

        return Math.max(even, odd);
    }
}
class PerfectSumProblem {

    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 10, 6, 8 };
        int target = 10;
        System.out.println("DP memo" + perfectSum(arr, target));
        System.out.println("Recursion" + recursionsum(0, arr, target));
    }

    // tabulation
    public int perfectSumTabu(int[] nums, int target) {
        int n = nums.length;

        int[][] dp = new int[n + 1][target + 1];

        dp[n][0] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int t = 0; t <= target; t++) {

                int skip = dp[i + 1][t];

                int pick = 0;
                if (nums[i] <= t) {
                    pick = dp[i + 1][t - nums[i]];
                }

                dp[i][t] = skip + pick;
            }
        }

        return dp[0][target];
    }

    public static int perfectSum(int[] nums, int target) {
        int dp[][] = new int[nums.length][target + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return sum(0, nums, target, dp);
    }

    // recursion + Memo
    private static int sum(int i, int[] arr, int target, int dp[][]) {

        if (i == arr.length) {
            return target == 0 ? 1 : 0;
        }

        if (dp[i][target] != -1)
            return dp[i][target];

        int skip = sum(i + 1, arr, target, dp);

        int pick = 0;
        if (arr[i] <= target) {
            pick = sum(i + 1, arr, target - arr[i], dp);
        }

        return dp[i][target] = skip + pick;
    }

    // recursion

    private static int recursionsum(int i, int[] arr, int target) {

        if (i == arr.length) {
            return target == 0 ? 1 : 0;
        }

        int skip = recursionsum(i + 1, arr, target);

        int pick = 0;
        if (arr[i] <= target) {
            pick = recursionsum(i + 1, arr, target - arr[i]);
        }

        return skip + pick;
    }
}
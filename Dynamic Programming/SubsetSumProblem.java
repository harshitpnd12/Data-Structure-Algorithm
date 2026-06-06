public class SubsetSumProblem {
    public static void main(String[] args) {
        int arr[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int dp[][] = new int[arr.length][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(subsetSum(0, arr, sum));
        System.out.println(subsetSum(0, arr, sum, dp));
        System.out.println(isSubsetSumTabu(arr, sum));
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        return subsetSum(0, arr, sum);
    }

    // recursion
    private static boolean subsetSum(int i, int arr[], int sum) {

        if (sum == 0)
            return true;

        if (i == arr.length)
            return false;

        boolean skip = subsetSum(i + 1, arr, sum);

        boolean pick = false;
        if (arr[i] <= sum) {
            pick = subsetSum(i + 1, arr, sum - arr[i]);
        }

        return pick || skip;
    }

    // Recursion + memo
    private static boolean subsetSum(int i, int arr[], int sum, int dp[][]) {

        if (sum == 0)
            return true;

        if (i == arr.length)
            return false;

        if (dp[i][sum] != -1) {
            if (dp[i][sum] == 1)
                return true;
            else
                return false;
        }

        boolean skip = subsetSum(i + 1, arr, sum, dp);

        boolean pick = false;
        if (arr[i] <= sum) {
            pick = subsetSum(i + 1, arr, sum - arr[i], dp);
        }

        if (pick || skip) {
            dp[i][sum] = 1;
        } else {
            dp[i][sum] = 0;
        }

        return dp[i][sum] == 1;
    }

    // Tabu
    static Boolean isSubsetSumTabu(int arr[], int sum) {
        boolean[][] dp = new boolean[arr.length + 1][sum + 1];
        dp[arr.length][0] = true;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < dp[0].length; j++) {
                boolean skip = dp[i + 1][j];

                boolean pick = false;
                if (arr[i] <= j) {
                    pick = dp[i + 1][j - arr[i]];
                }

                dp[i][j] = pick || skip;
            }
        }
        return dp[0][sum];
    }
}

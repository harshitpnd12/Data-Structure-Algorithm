public class RodCutting {
    public static void main(String[] args) {
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = price.length;
        Integer[] dp = new Integer[price.length + 1];
        System.out.println(solve(n, price));
        System.out.println(maxcut(price, price.length, dp));
    }

    // Recursion
    private static int solve(int len, int[] price) {
        if (len == 0) {
            return 0;
        }
        int maxProfit = 0;
        for (int cut = 1; cut <= len; cut++) {
            maxProfit = Math.max(maxProfit, price[cut - 1] + solve(len - cut, price));
        }
        return maxProfit;
    }

    private static int maxcut(int arr[], int length, Integer[] dp) {
        if (length == 0) {
            return 0;
        }
        if (dp[length] != null) {
            return dp[length];
        }
        int maxProfit = 0;
        for (int cut = 1; cut <= length; cut++) {
            maxProfit = Math.max(maxProfit, arr[cut - 1] + maxcut(arr, length - cut, dp));
        }
        return dp[length] = maxProfit;
    }
}

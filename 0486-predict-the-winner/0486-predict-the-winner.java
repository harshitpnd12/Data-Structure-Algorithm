class Solution {
    private Integer[][] memo;
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        memo = new Integer[n][n];
        return solve(nums, 0, n - 1) >= 0;
    }

    private int solve(int[] nums, int i, int j) {
        if (i == j) {
            return nums[i];
        }

        if (memo[i][j] != null) {
            return memo[i][j];
        }

        int pickLeft = nums[i] - solve(nums, i + 1, j);
        int pickRight = nums[j] - solve(nums, i, j - 1);

        return memo[i][j] = Math.max(pickLeft, pickRight);
    }
}
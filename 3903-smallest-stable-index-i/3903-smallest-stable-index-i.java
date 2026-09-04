class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];

        // Build suffix minimum
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int prefixMax = nums[0];

        // Find smallest stable index
        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, nums[i]);

            int instability = prefixMax - suffixMin[i];

            if (instability <= k) {
                return i;
            }
        }

        return -1;

    }
}
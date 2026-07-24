class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX = 2048;

        boolean[] pair = new boolean[MAX];
        boolean[] ans = new boolean[MAX];

        int n = nums.length;

        for (int x : nums) {
            ans[x] = true;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pair[nums[i] ^ nums[j]] = true;
            }
        }

        for (int p = 0; p < MAX; p++) {
            if (!pair[p]) continue;
            for (int x : nums) {
                ans[p ^ x] = true;
            }
        }

        int count = 0;
        for (boolean b : ans) {
            if (b) count++;
        }

        return count;
    }
}
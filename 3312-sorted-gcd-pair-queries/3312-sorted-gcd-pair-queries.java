class Solution {

    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        int[] freq = new int[max + 1];
        for (int x : nums) {
            freq[x]++;
        }

        long[] exact = new long[max + 1];

        // Count pairs divisible by i
        for (int i = max; i >= 1; i--) {

            long cnt = 0;

            for (int j = i; j <= max; j += i) {
                cnt += freq[j];
            }

            exact[i] = cnt * (cnt - 1) / 2;

            for (int j = i * 2; j <= max; j += i) {
                exact[i] -= exact[j];
            }
        }

        long[] prefix = new long[max + 1];

        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + exact[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            long k = queries[i] + 1;

            int l = 1, r = max;

            while (l < r) {
                int mid = l + (r - l) / 2;

                if (prefix[mid] >= k)
                    r = mid;
                else
                    l = mid + 1;
            }

            ans[i] = l;
        }

        return ans;
    }
}
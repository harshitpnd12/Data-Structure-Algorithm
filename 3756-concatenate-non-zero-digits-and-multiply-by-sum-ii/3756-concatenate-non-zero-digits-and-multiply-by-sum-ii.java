class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        final int MOD = 1_000_000_007;
        int n = s.length();

        // Prefix sum of non-zero digits
        int[] prefixSum = new int[n + 1];

        // Store positions and digits of non-zero characters
        List<Integer> posList = new ArrayList<>();
        List<Integer> digitList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';

            prefixSum[i + 1] = prefixSum[i];
            if (d != 0) {
                prefixSum[i + 1] += d;
                posList.add(i);
                digitList.add(d);
            }
        }

        int k = digitList.size();

        int[] positions = new int[k];
        long[] prefixNum = new long[k + 1];
        long[] pow10 = new long[k + 1];

        pow10[0] = 1;

        for (int i = 0; i < k; i++) {
            positions[i] = posList.get(i);
            prefixNum[i + 1] = (prefixNum[i] * 10 + digitList.get(i)) % MOD;
            pow10[i + 1] = (pow10[i] * 10) % MOD;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            int sum = prefixSum[r + 1] - prefixSum[l];

            if (sum == 0) {
                ans[i] = 0;
                continue;
            }

            int left = lowerBound(positions, l);
            int right = upperBound(positions, r) - 1;

            int len = right - left + 1;

            long x = (prefixNum[right + 1]
                    - (prefixNum[left] * pow10[len]) % MOD
                    + MOD) % MOD;

            ans[i] = (int) ((x * sum) % MOD);
        }

        return ans;
    }

    private int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }

        return l;
    }

    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > target)
                r = mid;
            else
                l = mid + 1;
        }

        return l;
    }
}
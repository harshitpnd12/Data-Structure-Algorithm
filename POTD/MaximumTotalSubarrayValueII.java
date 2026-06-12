import java.util.*;

class MaximumTotalSubarrayValueII {
    static class SparseTableRMQ {
        int n;
        int maxLog;
        int[][] stMax;
        int[][] stMin;
        int[] lg;

        SparseTableRMQ(int[] nums) {
            n = nums.length;
            maxLog = 32 - Integer.numberOfLeadingZeros(n) + 1;

            stMax = new int[maxLog][n];
            stMin = new int[maxLog][n];
            lg = new int[n + 1];

            for (int i = 2; i <= n; i++) {
                lg[i] = lg[i / 2] + 1;
            }

            for (int i = 0; i < n; i++) {
                stMax[0][i] = nums[i];
                stMin[0][i] = nums[i];
            }

            for (int j = 1; j < maxLog; j++) {
                int len = 1 << j;
                int half = len >> 1;
                for (int i = 0; i + len <= n; i++) {
                    stMax[j][i] = Math.max(stMax[j - 1][i], stMax[j - 1][i + half]);
                    stMin[j][i] = Math.min(stMin[j - 1][i], stMin[j - 1][i + half]);
                }
            }
        }

        int queryMax(int l, int r) {
            int j = lg[r - l + 1];
            return Math.max(stMax[j][l], stMax[j][r - (1 << j) + 1]);
        }

        int queryMin(int l, int r) {
            int j = lg[r - l + 1];
            return Math.min(stMin[j][l], stMin[j][r - (1 << j) + 1]);
        }
    }

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        SparseTableRMQ st = new SparseTableRMQ(nums);

        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(b[0], a[0])
        );

        for (int l = 0; l < n; l++) {
            long val = (long) st.queryMax(l, n - 1) - st.queryMin(l, n - 1);
            pq.offer(new long[]{val, l, n - 1});
        }

        long ans = 0;

        for (int i = 0; i < k; i++) {
            long[] cur = pq.poll();
            long val = cur[0];
            int l = (int) cur[1];
            int r = (int) cur[2];

            ans += val;

            if (r > l) {
                long nextVal = (long) st.queryMax(l, r - 1) - st.queryMin(l, r - 1);
                pq.offer(new long[]{nextVal, l, r - 1});
            }
        }

        return ans;
    }
}
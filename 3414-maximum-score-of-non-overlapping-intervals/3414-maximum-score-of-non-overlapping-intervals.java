import java.util.*;

class Solution {

    static class State {
        long score;
        List<Integer> indices;

        State(long score, List<Integer> indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();

        // [left, right, weight, originalIndex]
        int[][] arr = new int[n][4];

        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0);
            arr[i][1] = intervals.get(i).get(1);
            arr[i][2] = intervals.get(i).get(2);
            arr[i][3] = i;
        }

        // Sort by start position
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);

            return Integer.compare(a[3], b[3]);
        });

        // next[i] = first interval with start > arr[i][1]
        int[] next = new int[n];

        for (int i = 0; i < n; i++) {
            next[i] = lowerBound(arr, arr[i][1]);
        }

        State[][] dp = new State[n + 1][5];

        // Base case:
        // 0 intervals allowed -> choose nothing
        for (int i = 0; i <= n; i++) {
            dp[i][0] = new State(0, new ArrayList<>());
        }

        // No intervals remaining
        for (int k = 1; k <= 4; k++) {
            dp[n][k] = new State(0, new ArrayList<>());
        }

        for (int i = n - 1; i >= 0; i--) {

            for (int k = 1; k <= 4; k++) {

                // Option 1: skip current interval
                State skip = dp[i + 1][k];

                // Option 2: take current interval
                State nextState = dp[next[i]][k - 1];

                List<Integer> takeIndices =
                        new ArrayList<>();

                takeIndices.add(arr[i][3]);
                takeIndices.addAll(nextState.indices);

                // Indices in answer must be sorted
                Collections.sort(takeIndices);

                State take = new State(
                        arr[i][2] + nextState.score,
                        takeIndices
                );

                dp[i][k] = better(take, skip);
            }
        }

        return dp[0][4].indices
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // First index where arr[index][0] > right
    private int lowerBound(int[][] arr, int right) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid][0] > right) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    private State better(State a, State b) {

        // Maximum score
        if (a.score != b.score) {
            return a.score > b.score ? a : b;
        }

        // Equal score -> lexicographically smaller indices
        return compareLexicographically(a.indices, b.indices) <= 0
                ? a
                : b;
    }

    private int compareLexicographically(
            List<Integer> a,
            List<Integer> b) {

        int len = Math.min(a.size(), b.size());

        for (int i = 0; i < len; i++) {
            if (!a.get(i).equals(b.get(i))) {
                return Integer.compare(a.get(i), b.get(i));
            }
        }

        // Prefix case: shorter is smaller
        return Integer.compare(a.size(), b.size());
    }
}
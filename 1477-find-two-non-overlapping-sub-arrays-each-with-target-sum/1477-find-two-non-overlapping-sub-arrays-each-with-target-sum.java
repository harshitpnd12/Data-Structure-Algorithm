class Solution {
    public static int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = Integer.MAX_VALUE;
        int[] best = new int[n];
        Arrays.fill(best, INF);
        int left = 0;
        int sum = 0;
        int answer = INF;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > target && left <= right) {
                sum -= arr[left++];
            }
            if (sum == target) {
                int currentLength = right - left + 1;
                if (left > 0 && best[left - 1] != INF) {
                    answer = Math.min(
                        answer,
                        best[left - 1] + currentLength
                    );
                }
                if (right == 0) {
                    best[right] = currentLength;
                } else {
                    best[right] = Math.min(
                        best[right - 1],
                        currentLength
                    );
                }
            } else {
                if (right > 0) {
                    best[right] = best[right - 1];
                }
            }
        }
        return answer == INF ? -1 : answer;
    }

}
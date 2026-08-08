class Solution {
    public int[] validSequence(String word1, String word2) {
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        int n = a.length;
        int m = b.length;

        int[] dp = new int[n + 1];

        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (j >= 0 && a[i] == b[j]) {
                dp[i] = dp[i + 1] + 1;
                j--;
            } else {
                dp[i] = dp[i + 1];
            }
        }

        int[] ans = new int[m];

        int i = 0;
        j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                ans[j] = i;
                j++;
            }

            else if (dp[i + 1] >= m - j - 1) {
                ans[j] = i;
                j++;
                i++;
                break;
            }

            i++;
        }
        if (j < m && i == n) {
            return new int[0];
        }
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                ans[j] = i;
                j++;
            }
            i++;
        }

        if (j < m) {
            return new int[0];
        }

        return ans;
    }
}
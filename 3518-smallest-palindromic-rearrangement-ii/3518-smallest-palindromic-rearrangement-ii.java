class Solution {

    private long limit;

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    // Computes C(n, r), capped at limit
    private long combination(int n, int r) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);

        long ans = 1;

        for (int i = 1; i <= r; i++) {
            long num = n - r + i;
            long den = i;

            long g = gcd(num, den);
            num /= g;
            den /= g;

            g = gcd(ans, den);
            ans /= g;
            den /= g;

            if (ans > limit / num) return limit;

            ans *= num;
            ans /= den;

            if (ans >= limit) return limit;
        }

        return Math.min(ans, limit);
    }

    // Number of distinct permutations of the multiset
    private long countWays(int[] cnt) {
        int total = 0;
        for (int x : cnt) total += x;

        long ans = 1;
        int rem = total;

        for (int x : cnt) {
            if (x == 0) continue;

            long c = combination(rem, x);

            if (ans > limit / c) return limit;

            ans *= c;

            if (ans >= limit) return limit;

            rem -= x;
        }

        return Math.min(ans, limit);
    }

    public String smallestPalindrome(String s, int k) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int[] half = new int[26];
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            if ((freq[i] & 1) == 1) {
                mid = (char) ('a' + i);
            }
        }

        limit = k;

        if (countWays(half) < k) return "";

        StringBuilder first = new StringBuilder();
        int len = s.length() / 2;

        for (int pos = 0; pos < len; pos++) {

            for (int c = 0; c < 26; c++) {

                if (half[c] == 0) continue;

                half[c]--;

                long ways = countWays(half);

                if (ways >= k) {
                    first.append((char) ('a' + c));
                    break;
                }

                k -= ways;
                half[c]++;
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(first);

        if (mid != 0) ans.append(mid);

        ans.append(new StringBuilder(first).reverse());

        return ans.toString();
    }
}
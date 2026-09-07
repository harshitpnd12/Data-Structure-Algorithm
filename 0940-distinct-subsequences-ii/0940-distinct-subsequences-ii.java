class Solution {
    public int distinctSubseqII(String s) {
        final long MOD = 1_000_000_007;
        long[] end = new long[26];
        long total = 0;
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            long newCount = (total + 1) % MOD;
            total = (total - end[idx] + MOD) % MOD;
            end[idx] = newCount;
            total = (total + newCount) % MOD;
        }
        return (int) total;
    }
}
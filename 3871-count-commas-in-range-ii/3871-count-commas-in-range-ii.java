class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long power = 1000;

        while (power <= n) {
            ans += n - power + 1;

            // Move to next comma position
            if (power > Long.MAX_VALUE / 1000) {
                break;
            }

            power *= 1000;
        }

        return ans;
    }
}
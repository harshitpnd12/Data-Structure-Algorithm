class Solution {
    public int countCommas(int n) {
        long ans = 0;
        long power = 1000;
        int commas = 1;
        while (power <= n) {
            long end = Math.min((long) n, power * 1000 - 1);
            ans += (end - power + 1) * commas;
            power *= 1000;
            commas++;
        }
        return (int)ans;
    }
}
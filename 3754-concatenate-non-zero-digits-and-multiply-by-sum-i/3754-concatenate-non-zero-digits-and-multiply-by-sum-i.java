class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long newn = 0;
        while(n > 0){
            long digit = n % 10;
            sum += digit;
            if(digit != 0){
                newn = 10 * newn + digit;
            }
            n = n / 10;
        }
        newn = reverse(newn);
        return newn * sum;
    }
    public long reverse(long x) {
        long rev=0;
        while(x!=0){
            long digit=x%10;
            x=x/10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
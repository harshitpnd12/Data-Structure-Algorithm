class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        while(true){
            if(digitmultiple(i) % t == 0){
                return i;
            }
            i++;
        }
    }
    private int digitmultiple(int n){
        int pro=1;
        while(n>0){
            int digit=n%10;
            n/=10;
            pro*=digit;
        }
        return pro;
    }
}
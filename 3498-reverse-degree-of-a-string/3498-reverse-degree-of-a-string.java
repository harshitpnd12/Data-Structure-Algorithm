class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int c = 'z' - s.charAt(i) + 1;
            int p = c * (i+1);
            sum+=p;
        }
        return sum;
    }
}
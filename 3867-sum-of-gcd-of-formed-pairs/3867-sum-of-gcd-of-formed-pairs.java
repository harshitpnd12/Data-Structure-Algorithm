class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int mx=nums[0];
        int gcd[]=new int[n];
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            gcd[i]=gcd(nums[i],mx);
        }
        Arrays.sort(gcd);
        long ans=0;
        for(int i = 0; i < n / 2; i++){
            int e = gcd(gcd[i], gcd[n-1-i]);
            ans += e;
        }
        return ans;
    }
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
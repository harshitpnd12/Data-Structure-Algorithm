class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                j=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>secmax && j!=i){
                secmax=nums[i];
            }
        }
        return (max-1)*(secmax-1);
    }
}
class Solution {
    public int minimumDeletions(int[] nums) {
        int maxi=-1;
        int mini=-1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxi=i;
            }
            if(nums[i]<min){
                min=nums[i];
                mini=i;
            }
        }
        int left = Math.min(mini, maxi);
        int right = Math.max(mini, maxi);
        int n = nums.length;

        int fromFront = right + 1;
        int fromBack = n - left;
        int fromBoth = left + 1 + n - right;

        return Math.min(fromFront, Math.min(fromBack, fromBoth));
    }
}
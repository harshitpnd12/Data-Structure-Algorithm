class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[nums.length*2];
        int i=0;
        for(int num:nums){
            arr[i++]=num;
        }
        for(int j=nums.length-1;j>=0;j--){
            arr[i++]=nums[j];
        }
        return arr;
    }
}
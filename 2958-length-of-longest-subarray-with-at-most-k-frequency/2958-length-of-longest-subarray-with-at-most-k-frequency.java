class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ls=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }
            int count=right-left+1;
            ls=Math.max(ls,count);
        }
        return ls;
    }
}
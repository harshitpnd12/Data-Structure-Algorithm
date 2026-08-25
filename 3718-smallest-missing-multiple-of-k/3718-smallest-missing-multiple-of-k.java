class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i = 1;

        while (true) {
            int multiple = i * k;

            if (!set.contains(multiple)) {
                return multiple;
            }

            i++;
        }
    }
}
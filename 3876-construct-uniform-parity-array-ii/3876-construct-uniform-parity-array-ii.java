class Solution {
    public boolean uniformArray(int[] nums) {
        boolean hasOdd = false;
        boolean hasEven = false;

        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);

            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }
        if (!hasOdd || !hasEven) {
            return true;
        }
        return min % 2 != 0;
    }
}
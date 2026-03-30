class Solution {
    public int missingNumber(int[] nums) {
        
      



        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i) {
                return i;   // ✅ return missing number
            }
        }

        return nums.length;  // ✅ handle last case
    }
}
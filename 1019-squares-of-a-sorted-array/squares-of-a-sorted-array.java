class Solution {
    public int[] sortedSquares(int[] nums) {
        
     
        int n = nums.length;

        // Step 1: square all elements
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Step 2: sort the array
        Arrays.sort(nums);

        return nums;
    }
}
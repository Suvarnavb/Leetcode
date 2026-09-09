class Solution {
    public int thirdMax(int[] nums) {

        long max = nums[0];

        // Find maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        long secmax = Long.MIN_VALUE;

        // Find second maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secmax && nums[i] != max) {
                secmax = nums[i];
            }
        }

        long thirdMax = Long.MIN_VALUE;

        // Find third maximum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > thirdMax &&
                nums[i] != secmax &&
                nums[i] != max) {

                thirdMax = nums[i];
            }
        }

        // No third distinct maximum
        if (thirdMax == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) thirdMax;
    }
}
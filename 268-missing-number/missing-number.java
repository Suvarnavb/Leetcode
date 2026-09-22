class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        for(int i = 0; i <= n; i++) {

            int count = 0;

            for(int j = 0; j < nums.length; j++) {

                if(nums[j] == i) {
                    count++;
                    break;
                }
            }

            if(count == 0) {
                return i;
            }
        }

        return -1;
    }
}
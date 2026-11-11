
class Solution {
    public int[] findErrorNums(int[] nums) {

        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (i == nums[j]) {
                    count++;
                }
            }

            if (count == 2) {
                duplicate = i;
            }

            if (count == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}

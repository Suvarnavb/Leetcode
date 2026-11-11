
class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int b[] = new int[nums.length];

        int even = 0;
        int odd = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                b[even] = nums[i];
                even = even + 2;
            }
            else {
                b[odd] = nums[i];
                odd = odd + 2;
            }
        }

        return b;
    }
}

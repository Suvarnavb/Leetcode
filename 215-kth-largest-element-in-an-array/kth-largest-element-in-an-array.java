class Solution {
    public int findKthLargest(int[] nums, int k) {

        int[] count = new int[20001];

        for(int i = 0; i < nums.length; i++) {
            count[nums[i] + 10000]++;
        }

        for(int i = 20000; i >= 0; i--) {

            k = k - count[i];

            if(k <= 0) {
                return i - 10000;
            }
        }

        return -1;
    }
}
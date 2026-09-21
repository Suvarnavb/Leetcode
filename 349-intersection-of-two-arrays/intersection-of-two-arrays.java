class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        int nums[] = new int[nums1.length + nums2.length];
        int k = 0;

        for(int i = 0; i < nums1.length; i++) {

            for(int j = 0; j < nums2.length; j++) {

                if(nums1[i] == nums2[j]) {

                    int count = 0;

                    for(int x = 0; x < k; x++) {
                        if(nums[x] == nums1[i]) {
                            count++;
                        }
                    }

                    if(count == 0) {
                        nums[k] = nums1[i];
                        k++;
                    }

                    break;
                }
            }
        }

        int result[] = new int[k];

        for(int i = 0; i < k; i++) {
            result[i] = nums[i];
        }

        return result;
    }
}
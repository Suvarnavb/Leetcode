
import java.util.*;

class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int b[] = nums.clone();

        Arrays.sort(b);

        int start = -1;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != b[i]) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }

        if (start == -1) {
            return 0;
        }

        return end - start + 1;
    }
}

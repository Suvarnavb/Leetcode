import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int c[] = new int[m + n];

        int k = 0;

        for (int i = 0; i < m; i++) {
            c[k] = nums1[i];
            k++;
        }

        for (int i = 0; i < n; i++) {
            c[k] = nums2[i];
            k++;
        }

        Arrays.sort(c);

        for (int i = 0; i < c.length; i++) {
            nums1[i] = c[i];
        }
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] c = new int[nums1.length + nums2.length];

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            c[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < nums2.length; i++) {
            c[nums1.length + i] = nums2[i];
        }

        // Sort merged array
        Arrays.sort(c);

        int n = c.length;

        // Odd length
        if (n % 2 == 1) {
            return c[n / 2];
        }

        // Even length
        return (c[n / 2 - 1] + c[n / 2]) / 2.0;
    }
}
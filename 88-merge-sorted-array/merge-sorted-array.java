class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] c = new int[m + n];

        for(int i = 0; i < m; i++) {
            c[i] = nums1[i];
        }

        for(int i = 0; i < n; i++) {
            c[m + i] = nums2[i];
        }

        Arrays.sort(c);

        for(int i = 0; i < c.length; i++) {
            nums1[i] = c[i];
        }
    }
}
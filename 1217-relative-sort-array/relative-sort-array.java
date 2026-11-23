
import java.util.Arrays;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int k = 0;

        // Sort elements according to arr2
        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if (arr1[j] == arr2[i]) {
                    int temp = arr1[k];
                    arr1[k] = arr1[j];
                    arr1[j] = temp;

                    k++;
                }
            }
        }

        // Sort remaining elements
        Arrays.sort(arr1, k, arr1.length);

        return arr1;
    }
}

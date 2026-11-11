
import java.util.*;

class Solution {
    public int numFactoredBinaryTrees(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        long dp[] = new long[n];

        long ans = 0;
        int mod = 1000000007;

        for (int i = 0; i < n; i++) {

            dp[i] = 1;

            for (int j = 0; j < i; j++) {

                if (arr[i] % arr[j] == 0) {

                    int right = arr[i] / arr[j];

                    for (int k = 0; k < i; k++) {

                        if (arr[k] == right) {
                            dp[i] += dp[j] * dp[k];
                            dp[i] %= mod;
                            break;
                        }
                    }
                }
            }

            ans += dp[i];
            ans %= mod;
        }

        return (int) ans;
    }
}

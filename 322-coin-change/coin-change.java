class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[] = new int[amount + 1];

        // Initially fill with a large value
        for (int i = 0; i <= amount; i++) {
            dp[i] = amount + 1;
        }

        // Zero amount needs zero coins
        dp[0] = 0;

        // Check every amount
        for (int i = 1; i <= amount; i++) {

            // Check every coin
            for (int j = 0; j < coins.length; j++) {

                if (coins[j] <= i) {

                    dp[i] = Math.min(
                        dp[i],
                        dp[i - coins[j]] + 1
                    );
                }
            }
        }

        if (dp[amount] > amount) {
            return -1;
        }

        return dp[amount];
    }
}
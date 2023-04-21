package Hard;

class Problem879 {
    int mod = (int) 1e9 + 7;

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][][] dp = new int[n + 1][minProfit + 1][group.length];

        for (int[][] d_p : dp) {
            for (int[] d : d_p) {
                Arrays.fill(d, -1);
            }
        }

        return solve(n, minProfit, group, profit, 0, dp);
    }

    int solve(int n, int minProfit, int[] group, int[] profit, int i, int[][][] dp) {
        // if no. of man condition reached return 1 if req. profit achieved
        if (n == 0) {
            return minProfit == 0 ? 1 : 0;
        }

        // if we traversed whole array return 1 if req. profit achieved
        if (i == group.length) {
            return minProfit == 0 ? 1 : 0;
        }

        if (dp[n][minProfit][i] != -1)
            return dp[n][minProfit][i];

        int ans = 0;

        // if we can take current group
        if (n >= group[i]) {
            ans += solve(n - group[i], Math.max(0, minProfit - profit[i]), group, profit, i + 1, dp) % mod;
        }

        // if we do not consider current group
        ans += solve(n, minProfit, group, profit, i + 1, dp) % mod;

        return dp[n][minProfit][i] = ans % mod;
    }
}
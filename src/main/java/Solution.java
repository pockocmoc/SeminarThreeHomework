public class Solution {
    static int countPaths(int xStart, int yStart, int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = xStart; i < m; i++) {
            dp[i][yStart] = 1;
        }
        for (int j = yStart; j < n; j++) {
            dp[xStart][j] = 1;
        }
        for (int i = xStart + 1; i < m; i++) {
            for (int j = yStart + 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

}

package DSAUDemy.DynamicProgramming;

public class CountingTress {
    static int count_tress(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int x = count_tress(i - 1, dp);
            int y = count_tress(n - i, dp);

            ans += x * y;
        }

        return dp[n] = ans;
    }

}
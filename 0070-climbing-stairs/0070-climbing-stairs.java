/**
0 0
1 1
2 2
3 3
4 5
    2 2
    1 1 2
    1 1 1 1
    2 1 1
    1 2 1
5 8
*/

class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
package io.github.cchenxi.leetcode.algorithm1.n91DecodeWays;

/**
 * Date: 2020-08-30
 *
 * @author chenxi
 */
public class Solution_1_1 implements DecodeWays {
    @Override
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                dp[i + 1] += dp[i];
            }
            int num = Integer.valueOf(s.substring(i - 1, i + 1));
            if (num >= 10 && num <= 26) {
                dp[i + 1] += dp[i - 1];
            }
        }

        return dp[s.length()];
    }
}

package io.github.cchenxi.leetcode.p643;

/**
 * @see <a href="https://leetcode-cn.com/problems/maximum-average-subarray-i/">643. 子数组最大平均数 I</a>
 * Date: 2021-08-29
 *
 * @author chenxi
 */
public class Solution01 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return 1.0 * maxSum / k;
    }
}

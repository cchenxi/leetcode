package io.github.cchenxi.leetcode.algorithm2.p16;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode-cn.com/problems/3sum-closest/">最接近的三数之和</a>
 * Date: 2021-08-08
 *
 * @author chenxi
 */
public class Solution01 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException("参数错误");
        }

        // 双指针 一定要先排序
        Arrays.sort(nums);
        // 存放最小差值，初始时给最大值
        int diff = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // 差值的绝对值比最小差值还小
                if (Math.abs(sum - target) < diff) {
                    // 更新diff 和result
                    diff = Math.abs(sum - target);
                    result = sum;
                }

                // 双指针两路夹逼
                if (target < sum) {
                    right--;
                } else if (target > sum) {
                    left++;
                } else {
                    return sum;
                }
            }
        }

        return result;
    }
}

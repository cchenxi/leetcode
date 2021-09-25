package io.github.cchenxi.leetcode.p15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chenxi
 * @see <a href="https://leetcode-cn.com/problems/3sum/">三数之和</a>
 * Date: 2021-08-08
 */
public class Solution01 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    while (left < right && nums[right] == nums[--right]);
                } else if (sum < 0) {
                    while (left < right && nums[left] == nums[++left]);
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 双指针 同时向左和向右移动才有可能使下一个和=0
                    // 单纯向右 会使和减小
                    while (left < right && nums[right] == nums[--right]);
                    // 单纯向左 会使和增大
                    while (left < right && nums[left] == nums[++left]);
                }
            }
        }

        return result;
    }
}

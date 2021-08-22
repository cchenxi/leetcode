package io.github.cchenxi.leetcode.p18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/4sum/">18. 四数之和</a>
 * Date: 2021-08-22
 *
 * @author chenxi
 */
public class Solution01 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;

                while(left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        while(left < right && nums[right] == nums[--right]);
                    } else if (sum < target) {
                        while(left < right && nums[left] == nums[++left]);
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left < right && nums[right] == nums[--right]);
                        while(left < right && nums[left] == nums[++left]);
                    }
                }
            }
        }

        return result;
    }
}

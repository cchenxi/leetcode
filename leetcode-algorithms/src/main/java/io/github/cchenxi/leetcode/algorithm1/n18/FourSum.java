package io.github.cchenxi.leetcode.algorithm1.n18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 *
 * 示例：
 *
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * Date: 2020-07-26
 *
 * @author chenxi
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return Collections.emptyList();
        }

        //有序数组 左右夹逼
        Arrays.sort(nums);
        Set<List<Integer>> result = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int x = i + 1; x < nums.length - 2; x++) {
                int j = x + 1;
                int k = nums.length - 1;
                int leftTarget = target - nums[i] - nums[x];
                while (j < k) {
                    if (nums[j] + nums[k] == leftTarget) {
                        result.add(Arrays.asList(nums[i], nums[x], nums[j], nums[k]));
                        j++;
                        k--;
                        //调过重复
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    } else if (nums[j] + nums[k] > leftTarget) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }
}

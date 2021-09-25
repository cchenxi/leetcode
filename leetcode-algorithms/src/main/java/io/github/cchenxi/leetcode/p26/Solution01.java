package io.github.cchenxi.leetcode.p26;

/**
 * @see <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/">删除有序数组中的重复项</a>
 * Date: 2021-08-05
 *
 * @author chenxi
 */
public class Solution01 {
    public int removeDuplicates(int[] nums) {
        // 异常场景
        if (nums == null) {
            return 0;
        }
        if (nums.length < 2) {
            return 1;
        }

        // 双指针
        // j 记录不同的数字
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            // 由于数组是排好序的，将不同的数放到j的后一位
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}

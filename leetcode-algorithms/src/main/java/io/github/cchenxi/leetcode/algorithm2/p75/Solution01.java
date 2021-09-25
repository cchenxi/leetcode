package io.github.cchenxi.leetcode.algorithm2.p75;

/**
 * @see <a href="https://leetcode-cn.com/problems/sort-colors/">75. 颜色分类</a>
 * Date: 2021-08-29
 *
 * @author chenxi
 */
public class Solution01 {
    public void sortColors(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int p0 = 0;
        int p2 = nums.length - 1;
        int i = 0;

        while (i <= p2) {
            if (nums[i] == 0) {
                swap(nums, p0, i);
                i++;
                p0++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, p2, i);
                p2--;
            }
        }
    }

    private void swap(int[] nums, int p, int i) {
        if (p == i) {
            return;
        }

        int tmp = nums[p];
        nums[p] = nums[i];
        nums[i] = tmp;
    }
}

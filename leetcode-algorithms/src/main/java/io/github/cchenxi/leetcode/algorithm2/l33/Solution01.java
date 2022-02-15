package io.github.cchenxi.leetcode.algorithm2.l33;

/**
 * <a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array/">33. 搜索旋转排序数组</a>
 * Date: 2022-02-15
 *
 * @author chenxi
 */
public class Solution01 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[0] <= nums[mid] && (target > nums[mid] || target < nums[0])) {
                left = mid + 1;
            } else if (target > nums[mid] && target < nums[0]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left == right && nums[left] == target ? left : -1;
    }
}

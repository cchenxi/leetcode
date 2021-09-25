package io.github.cchenxi.leetcode.p905;

/**
 * <a href="https://leetcode-cn.com/problems/sort-array-by-parity/">905. 按奇偶排序数组</a>
 * Date: 2021-09-22
 *
 * @author chenxi
 */
public class Solution01 {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 != 0) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                right--;
            } else {
                left++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        int[] nums = {1, 2, 3, 4};

        System.out.println(
                solution.sortArrayByParity(nums)
        );
    }
}

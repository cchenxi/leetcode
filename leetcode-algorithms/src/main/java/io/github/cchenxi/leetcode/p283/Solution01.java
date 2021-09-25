package io.github.cchenxi.leetcode.p283;

/**
 * @see <a href="https://leetcode-cn.com/problems/move-zeroes/">移动零</a>
 * Date: 2021-08-04
 *
 * @author chenxi
 */
public class Solution01 {
    public void moveZeroes(int[] nums) {
        // 空数组或数组长度=1 不需要处理
        if (nums == null || nums.length < 2) {
            return;
        }

        // j指针 用来存放非0元素
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            // i指针向后遍历，遇到不为0的开始处理
            if (nums[i] != 0) {
                // 存储到j指针的位置
                nums[j] = nums[i];
                // 双指针位置不相同，可以将i指针位置赋值为0
                if (i != j) {
                    nums[i] = 0;
                }
                // j指针后移
                j++;
            }
        }
    }
}

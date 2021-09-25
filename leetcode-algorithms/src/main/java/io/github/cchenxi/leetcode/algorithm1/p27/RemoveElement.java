package io.github.cchenxi.leetcode.algorithm1.p27;

/**
 * 27 remove element
 * Date: 2019-10-21
 *
 * @author chenxi
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;
        while (i < length) {
            if (nums[i] == val) {
                nums[i] = nums[length - 1];
                length--;
            } else {
                i++;
            }
        }
        return length;
    }
}

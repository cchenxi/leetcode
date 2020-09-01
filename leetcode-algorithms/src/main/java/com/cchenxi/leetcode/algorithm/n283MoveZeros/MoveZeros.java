package com.cchenxi.leetcode.algorithm.n283MoveZeros;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 *
 * 移动0 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 示例
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * tag: 数组
 *
 * Date: 2020-06-24
 *
 * @author chenxi
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        m3(nums);
    }

    public void m1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int x = 0;
        //loop 1，将非0元素移动到数组前面
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[x++] = nums[i];
            }
        }
        //loop 2，其余位补0
        while (x < nums.length) {
            nums[x++] = 0;
        }
    }

    public void m2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        //存储非0元素下标
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    /**
     * 二刷 2020-07-07
     *
     * 思路
     * 双指针
     * i 用来遍历数组元素
     * j 用来记录非0元素的索引
     * i遇到非0，就复制给nums[j],j永远跑不过i
     *
     * @param nums
     */
    public void m3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (j != i) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
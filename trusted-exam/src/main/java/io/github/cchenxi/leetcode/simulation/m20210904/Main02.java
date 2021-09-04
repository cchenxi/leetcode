package io.github.cchenxi.leetcode.simulation.m20210904;

/**
 * Date: 2021-09-04
 *
 * @author chenxi
 */
public class Main02 {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (maxIndex != i && nums[maxIndex] < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        Main02 main02 = new Main02();
        System.out.println(main02.dominantIndex(new int[]{3, 6, 1, 0}));
    }
}

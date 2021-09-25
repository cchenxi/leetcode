package io.github.cchenxi.leetcode.algorithm1.n26;

import io.github.cchenxi.leetcode.algorithm1.n26.RemoveDuplicatesFromSortedArray;
import org.junit.Test;

/**
 * Date: 2020-06-27
 *
 * @author chenxi
 */
public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void removeDuplicates() {
        RemoveDuplicatesFromSortedArray cl = new RemoveDuplicatesFromSortedArray();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = cl.removeDuplicates(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
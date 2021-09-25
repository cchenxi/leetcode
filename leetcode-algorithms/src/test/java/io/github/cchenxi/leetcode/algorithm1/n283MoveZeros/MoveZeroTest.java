package io.github.cchenxi.leetcode.algorithm1.n283MoveZeros;

import io.github.cchenxi.leetcode.algorithm1.n283MoveZeros.MoveZero;
import io.github.cchenxi.leetcode.algorithm1.n283MoveZeros.Solution_2_2;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-09-01
 *
 * @author chenxi
 */
public class MoveZeroTest {
    private MoveZero c;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        nums = new int[]{0,1,0,3,12};
    }

    @Test
    public void moveZeroes() {
        c = new Solution_2_2();
        c.moveZeroes(nums);
        loopArray(nums);
    }

    private static void loopArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
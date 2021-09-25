package io.github.cchenxi.leetcode.algorithm1.n1;

import io.github.cchenxi.leetcode.algorithm1.n1.Solution11;
import io.github.cchenxi.leetcode.algorithm1.n1.Solution12;
import io.github.cchenxi.leetcode.algorithm1.n1.Solution_2_1;
import io.github.cchenxi.leetcode.algorithm1.n1.TwoSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * TODO: description
 * Date: 2020-08-23
 *
 * @author chenxi
 */
public class TwoSumTest {
    private int[] nums;
    @Before
    public void setUp() throws Exception {
        nums = new int[]{2, 7, 11, 15, 5};
    }

    @Test
    public void twoSum() {
        TwoSum c = new Solution11();
        int[] result = c.twoSum(nums, 9);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void twoSum2() {
        TwoSum c = new Solution12();
        int[] result = c.twoSum(nums, 9);
        Assert.assertArrayEquals(new int[]{1, 0}, result);
    }

    @Test
    public void twoSum_2_1() {
        TwoSum c = new Solution_2_1();
        int[] result = c.twoSum(nums, 9);
        Assert.assertArrayEquals(new int[]{1, 0}, result);
    }
}
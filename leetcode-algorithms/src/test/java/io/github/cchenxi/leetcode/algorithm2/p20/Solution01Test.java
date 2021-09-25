package io.github.cchenxi.leetcode.algorithm2.p20;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2021-08-15
 *
 * @author chenxi
 */
public class Solution01Test {
    private Solution01 solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution01();
    }

    @Test
    public void isValid() {
        Assert.assertTrue(solution.isValid("[]"));
        Assert.assertFalse(solution.isValid("}{"));
    }
}
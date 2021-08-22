package io.github.cchenxi.leetcode.p18;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2021-08-22
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
    public void fourSum() {
        System.out.println(
                solution.fourSum(new int[]{1, -2, -5, -4, -3, 3, 3, 5, -3, -1}, -11)
        );
    }
}
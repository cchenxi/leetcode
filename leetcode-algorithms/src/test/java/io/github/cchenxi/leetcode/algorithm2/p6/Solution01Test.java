package io.github.cchenxi.leetcode.algorithm2.p6;

import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2021-08-17
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
    public void convert() {
        System.out.println(
                solution.convert("PAYPALISHIRING", 4)
        );
    }
}
package io.github.cchenxi.leetcode.simulation.m20210818;

import org.junit.Before;
import org.junit.Test;

/**
 * TODO: description
 * Date: 2021-08-18
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
    public void reverseString() {
        char[] chars = "helloa".toCharArray();
        solution.reverseString(chars);
        System.out.println(chars);
    }
}
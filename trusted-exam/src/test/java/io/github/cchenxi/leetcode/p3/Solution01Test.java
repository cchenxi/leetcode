package io.github.cchenxi.leetcode.p3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for {@link Solution01}.
 * Date: 2021-08-01
 *
 * @author chenxi
 */
public class Solution01Test {
    private Solution01 solution;

    @Before
    public void setUp() {
        solution = new Solution01();
    }

    @Test
    public void lengthOfLongestSubstring() {
        System.out.println(
                solution.lengthOfLongestSubstring("dvdf")
        );
    }
}
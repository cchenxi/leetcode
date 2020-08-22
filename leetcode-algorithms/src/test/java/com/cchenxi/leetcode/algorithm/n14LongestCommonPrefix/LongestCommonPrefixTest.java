package com.cchenxi.leetcode.algorithm.n14LongestCommonPrefix;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class LongestCommonPrefixTest {
    private LongestCommonPrefix c;

    @Before
    public void setUp() throws Exception {
        c = new LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix() {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(c.longestCommonPrefix(strs));
    }
}
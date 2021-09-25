package io.github.cchenxi.leetcode.algorithm1.n14LongestCommonPrefix;

import io.github.cchenxi.leetcode.algorithm1.n14LongestCommonPrefix.LongestCommonPrefix;
import org.junit.Before;
import org.junit.Test;

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
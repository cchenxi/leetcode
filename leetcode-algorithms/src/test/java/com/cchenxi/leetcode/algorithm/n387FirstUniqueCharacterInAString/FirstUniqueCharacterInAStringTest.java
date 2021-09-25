package com.cchenxi.leetcode.algorithm.n387FirstUniqueCharacterInAString;

import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class FirstUniqueCharacterInAStringTest {
    private FirstUniqueCharacterInAString c;

    @Before
    public void setUp() throws Exception {
        c = new FirstUniqueCharacterInAString();
    }

    @Test
    public void firstUniqChar() {
        String s = "io/github/cchenxi/leetcode";
        System.out.println(c.firstUniqChar(s));
    }
}
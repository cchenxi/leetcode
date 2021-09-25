package io.github.cchenxi.leetcode.algorithm1.n541ReverseString2;

import io.github.cchenxi.leetcode.algorithm1.n541ReverseString2.ReverseString2;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class ReverseString2Test {
    private ReverseString2 c;

    @Before
    public void setUp() throws Exception {
        c = new ReverseString2();
    }

    @Test
    public void reverseStr() {
        System.out.println(
                c.reverseStr("abcdefg", 2)
        );
    }
}
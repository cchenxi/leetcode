package com.cchenxi.leetcode.algorithm.n541ReverseString2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
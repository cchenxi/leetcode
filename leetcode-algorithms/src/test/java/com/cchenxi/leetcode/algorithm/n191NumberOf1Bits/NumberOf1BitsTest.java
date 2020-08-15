package com.cchenxi.leetcode.algorithm.n191NumberOf1Bits;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-15
 *
 * @author chenxi
 */
public class NumberOf1BitsTest {
    private NumberOf1Bits c;

    @Before
    public void setUp() throws Exception {
        c = new NumberOf1Bits();
    }

    @Test
    public void hammingWeight() {
        int x = 156;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(
                c.hammingWeight(x)
        );
    }
}
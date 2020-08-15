package com.cchenxi.leetcode.algorithm.n231PowerOfTwo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-15
 *
 * @author chenxi
 */
public class PowerOfTwoTest {
    private PowerOfTwo c;

    @Before
    public void setUp() throws Exception {
        c = new PowerOfTwo();
    }

    @Test
    public void isPowerOfTwo() {
        System.out.println(
                c.isPowerOfTwo(1)
        );
    }
}
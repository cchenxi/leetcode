package com.cchenxi.leetcode.algorithm.n8StringToIntegerAtoi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class StringToIntegerAtoiTest {
    private StringToIntegerAtoi c;

    @Before
    public void setUp() throws Exception {
        c = new StringToIntegerAtoi();
    }

    @Test
    public void myAtoi() {
        String s1 = "123";
        String s2 = "   123   ";
        String s3 = "-100";
        String s4 = "20  hello world";

        System.out.println(
                c.myAtoi(s4)
        );
    }
}
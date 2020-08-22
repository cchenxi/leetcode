package com.cchenxi.leetcode.algorithm.n709ToLowerCase;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class ToLowerCaseTest {
    private ToLowerCase c;

    @Before
    public void setUp() throws Exception {
        c = new ToLowerCase();
    }

    @Test
    public void toLowerCase() {
        String str = "Hello";
        c.toLowerCase(str);
    }
}
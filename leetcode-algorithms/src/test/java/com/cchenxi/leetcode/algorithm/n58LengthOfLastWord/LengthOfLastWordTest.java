package com.cchenxi.leetcode.algorithm.n58LengthOfLastWord;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class LengthOfLastWordTest {
    private LengthOfLastWord c;

    @Before
    public void setUp() throws Exception {
        c = new LengthOfLastWord();
    }

    @Test
    public void lengthOfLastWord() {
        String str = "a ";
        System.out.println(c.lengthOfLastWord(str));
    }
}
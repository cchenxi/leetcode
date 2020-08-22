package com.cchenxi.leetcode.algorithm.n151ReverseWordsInAString;

import org.junit.Before;
import org.junit.Test;

import com.cchenxi.leetcode.algorithm.n344ReverseString.ReverseString;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class ReverseWordsInAStringTest {
    private ReverseWordsInAString c;

    @Before
    public void setUp() throws Exception {
        c = new ReverseWordsInAString();
    }

    @Test
    public void reverseWords() {
        System.out.println(
                c.reverseWords("  hello world!  ")
        );
    }
}
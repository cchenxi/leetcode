package com.cchenxi.leetcode.algorithm.n125ValidPalindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-23
 *
 * @author chenxi
 */
public class ValidPalindromeTest {
    private ValidPalindrome c;

    @Before
    public void setUp() throws Exception {
        c = new ValidPalindrome();
    }

    @Test
    public void isPalindrome() {
        System.out.println(
                c.isPalindrome("A man, a plan, a canal: Panama")
        );
    }
}
package com.cchenxi.leetcode.algorithm.p20;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2019-10-20
 *
 * @author chenxi
 */
public class ValidParenthesesTest {

    @Test
    public void isValid() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid("[]"));
        assertFalse(validParentheses.isValid("[)"));
        assertTrue(validParentheses.isValid("[{}{}(())[]]"));
        assertFalse(validParentheses.isValid("[{}]{[}"));
        assertFalse(validParentheses.isValid("]"));
    }
}
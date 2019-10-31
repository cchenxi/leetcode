package com.cchenxi.leetcode.algorithm.p344;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

/**
 * Date: 2019-10-31
 *
 * @author chenxi
 */
public class ReverseStringTest {

    @Test
    public void reverseString() {
        char[] s = {'a'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(s);
        System.out.println(JSON.toJSONString(s));
    }
}
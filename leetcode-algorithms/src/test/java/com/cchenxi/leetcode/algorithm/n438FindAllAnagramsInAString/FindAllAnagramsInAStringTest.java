package com.cchenxi.leetcode.algorithm.n438FindAllAnagramsInAString;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-23
 *
 * @author chenxi
 */
public class FindAllAnagramsInAStringTest {
    private FindAllAnagramsInAString c;

    @Before
    public void setUp() throws Exception {
        c = new FindAllAnagramsInAString();
    }

    @Test
    public void findAnagrams() {
        List<Integer> result = c.findAnagrams("cbaebabacd", "abc");
        System.out.println(1);
    }
}
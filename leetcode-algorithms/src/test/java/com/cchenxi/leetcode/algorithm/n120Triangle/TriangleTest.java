package com.cchenxi.leetcode.algorithm.n120Triangle;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-13
 *
 * @author chenxi
 */
public class TriangleTest {
    private Triangle c;
    private List<List<Integer>> cases;

    @Before
    public void setUp() throws Exception {
        c = new Triangle();
        cases = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
    }

    @Test
    public void minimumTotal() {
        System.out.println(
                c.minimumTotal(cases)
        );
    }
}
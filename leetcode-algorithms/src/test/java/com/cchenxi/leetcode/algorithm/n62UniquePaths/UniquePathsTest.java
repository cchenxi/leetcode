package com.cchenxi.leetcode.algorithm.n62UniquePaths;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-02
 *
 * @author chenxi
 */
public class UniquePathsTest {
    private UniquePaths c;

    @Before
    public void setUp() throws Exception {
        c = new UniquePaths();
    }

    @Test
    public void uniquePaths() {
        System.out.println(
                c.uniquePaths(7, 3)
        );
    }
}
package com.cchenxi.leetcode.algorithm.n45;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-07-26
 *
 * @author chenxi
 */
public class JumpGame2Test {
    private JumpGame2 c;
    int[] nums;

    @Before
    public void setUp() throws Exception {
        c = new JumpGame2();
        nums = new int[]{2,3,1,2,4,2,3};
    }

    @Test
    public void jump() {
        System.out.println(
                c.jump(nums)
        );
    }
}
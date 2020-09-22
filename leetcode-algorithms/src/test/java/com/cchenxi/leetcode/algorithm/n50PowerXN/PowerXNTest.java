package com.cchenxi.leetcode.algorithm.n50PowerXN;

import org.junit.Test;

/**
 * Date: 2020-07-12
 *
 * @author chenxi
 */
public class PowerXNTest {

    @Test
    public void myPow() {
        PowerXN c = new PowerXN();
        System.out.println(c.myPow(2, -10));
    }

    @Test
    public void pow() {
        PowXXN c = new Solution_4_1();

        System.out.println(c.myPow(2, 3));
    }
}
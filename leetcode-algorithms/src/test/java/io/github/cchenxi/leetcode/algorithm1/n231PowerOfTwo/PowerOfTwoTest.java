package io.github.cchenxi.leetcode.algorithm1.n231PowerOfTwo;

import io.github.cchenxi.leetcode.algorithm1.n231PowerOfTwo.PowerOfTwo;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-15
 *
 * @author chenxi
 */
public class PowerOfTwoTest {
    private PowerOfTwo c;

    @Before
    public void setUp() throws Exception {
        c = new PowerOfTwo();
    }

    @Test
    public void isPowerOfTwo() {
        System.out.println(
                c.isPowerOfTwo(1)
        );
    }
}
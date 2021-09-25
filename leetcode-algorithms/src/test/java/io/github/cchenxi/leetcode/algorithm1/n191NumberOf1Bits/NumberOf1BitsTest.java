package io.github.cchenxi.leetcode.algorithm1.n191NumberOf1Bits;

import io.github.cchenxi.leetcode.algorithm1.n191NumberOf1Bits.NumberOf1Bits;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-15
 *
 * @author chenxi
 */
public class NumberOf1BitsTest {
    private NumberOf1Bits c;

    @Before
    public void setUp() throws Exception {
        c = new NumberOf1Bits();
    }

    @Test
    public void hammingWeight() {
        int x = 156;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(
                c.hammingWeight(x)
        );
    }
}
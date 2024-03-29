package io.github.cchenxi.leetcode.algorithm1.n771JewelsAndStones;

import io.github.cchenxi.leetcode.algorithm1.n771JewelsAndStones.JewelsAndStones;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class JewelsAndStonesTest {
    private JewelsAndStones c;

    @Before
    public void setUp() throws Exception {
        c = new JewelsAndStones();
    }

    @Test
    public void numJewelsInStones() {
        String j = "aA";
        String s = "aAAbbbb";
        System.out.println(c.numJewelsInStones(j, s));
    }
}
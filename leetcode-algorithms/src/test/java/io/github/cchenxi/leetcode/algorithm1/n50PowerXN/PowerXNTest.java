package io.github.cchenxi.leetcode.algorithm1.n50PowerXN;

import io.github.cchenxi.leetcode.algorithm1.n50PowerXN.PowXXN;
import io.github.cchenxi.leetcode.algorithm1.n50PowerXN.PowerXN;
import io.github.cchenxi.leetcode.algorithm1.n50PowerXN.Solution_4_1;
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
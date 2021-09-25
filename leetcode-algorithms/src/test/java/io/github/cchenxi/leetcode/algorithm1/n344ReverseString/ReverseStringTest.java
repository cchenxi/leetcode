package io.github.cchenxi.leetcode.algorithm1.n344ReverseString;

import io.github.cchenxi.leetcode.algorithm1.n344ReverseString.ReverseString;
import org.junit.Test;

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
        System.out.println(String.valueOf(s));
    }
}
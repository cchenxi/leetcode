package io.github.cchenxi.leetcode.algorithm1.n709ToLowerCase;

import io.github.cchenxi.leetcode.algorithm1.n709ToLowerCase.ToLowerCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class ToLowerCaseTest {
    private ToLowerCase c;

    @Before
    public void setUp() throws Exception {
        c = new ToLowerCase();
    }

    @Test
    public void toLowerCase() {
        String str = "Hello";
        c.toLowerCase(str);
    }
}
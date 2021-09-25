package io.github.cchenxi.leetcode.algorithm1.n387FirstUniqueCharacterInAString;

import io.github.cchenxi.leetcode.algorithm1.n387FirstUniqueCharacterInAString.FirstUniqueCharacterInAString;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class FirstUniqueCharacterInAStringTest {
    private FirstUniqueCharacterInAString c;

    @Before
    public void setUp() throws Exception {
        c = new FirstUniqueCharacterInAString();
    }

    @Test
    public void firstUniqChar() {
        String s = "io/github/cchenxi/leetcode";
        System.out.println(c.firstUniqChar(s));
    }
}
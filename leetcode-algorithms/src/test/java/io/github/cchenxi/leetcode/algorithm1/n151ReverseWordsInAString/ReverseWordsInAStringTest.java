package io.github.cchenxi.leetcode.algorithm1.n151ReverseWordsInAString;

import io.github.cchenxi.leetcode.algorithm1.n151ReverseWordsInAString.ReverseWordsInAString;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class ReverseWordsInAStringTest {
    private ReverseWordsInAString c;

    @Before
    public void setUp() throws Exception {
        c = new ReverseWordsInAString();
    }

    @Test
    public void reverseWords() {
        System.out.println(
                c.reverseWords("  hello world!  ")
        );
    }
}
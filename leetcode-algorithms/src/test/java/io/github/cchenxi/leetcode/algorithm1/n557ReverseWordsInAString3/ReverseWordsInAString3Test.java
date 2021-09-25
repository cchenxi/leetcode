package io.github.cchenxi.leetcode.algorithm1.n557ReverseWordsInAString3;

import io.github.cchenxi.leetcode.algorithm1.n557ReverseWordsInAString3.ReverseWordsInAString3;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class ReverseWordsInAString3Test {
    private ReverseWordsInAString3 c;

    @Before
    public void setUp() throws Exception {
        c = new ReverseWordsInAString3();
    }

    @Test
    public void reverseWords() {
        System.out.println(
                c.reverseWords("Let's take LeetCode contest")
        );
    }
}
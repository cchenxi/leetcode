package io.github.cchenxi.leetcode.algorithm1.n125ValidPalindrome;

import io.github.cchenxi.leetcode.algorithm1.n125ValidPalindrome.ValidPalindrome;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-23
 *
 * @author chenxi
 */
public class ValidPalindromeTest {
    private ValidPalindrome c;

    @Before
    public void setUp() throws Exception {
        c = new ValidPalindrome();
    }

    @Test
    public void isPalindrome() {
        System.out.println(
                c.isPalindrome("A man, a plan, a canal: Panama")
        );
    }
}
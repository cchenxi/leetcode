package io.github.cchenxi.leetcode.algorithm1.n58LengthOfLastWord;

import io.github.cchenxi.leetcode.algorithm1.n58LengthOfLastWord.LengthOfLastWord;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class LengthOfLastWordTest {
    private LengthOfLastWord c;

    @Before
    public void setUp() throws Exception {
        c = new LengthOfLastWord();
    }

    @Test
    public void lengthOfLastWord() {
        String str = "a ";
        System.out.println(c.lengthOfLastWord(str));
    }
}
package com.cchenxi.leetcode.algorithm.n212WordSearch2;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-29
 *
 * @author chenxi
 */
public class WordSearch2Test {
    private WordSearch2 c;
    private char[][] boards;
    private String[] words;

    @Before
    public void setUp() throws Exception {
        c = new Solution_1_1();
        boards = new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        words = new String[]{"oath", "pea", "eat", "rain"};
    }

    @Test
    public void findWords() {
        List<String> result = c.findWords(boards, words);
        System.out.println(1);
    }
}
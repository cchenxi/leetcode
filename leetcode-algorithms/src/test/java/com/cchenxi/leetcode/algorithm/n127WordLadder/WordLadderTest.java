package com.cchenxi.leetcode.algorithm.n127WordLadder;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-30
 *
 * @author chenxi
 */
public class WordLadderTest {
    private WordLadder c;
    private String beginWord;
    private String endWord;
    private List<String> wordList;

    @Before
    public void setUp() throws Exception {
        c = new Solution_1_2();
        beginWord = "hit";
        endWord = "cog";
        wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
    }

    @Test
    public void ladderLength() {
        int count = c.ladderLength(beginWord, endWord, wordList);
        System.out.println(count);
    }
}
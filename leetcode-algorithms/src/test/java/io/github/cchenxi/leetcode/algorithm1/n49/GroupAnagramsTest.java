package io.github.cchenxi.leetcode.algorithm1.n49;

import java.util.List;

import io.github.cchenxi.leetcode.algorithm1.n49.GroupAnagrams;
import org.junit.Test;

/**
 * Date: 2020-07-04
 *
 * @author chenxi
 */
public class GroupAnagramsTest {

    @Test
    public void groupAnagrams() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);
        System.out.println(1);
    }
}
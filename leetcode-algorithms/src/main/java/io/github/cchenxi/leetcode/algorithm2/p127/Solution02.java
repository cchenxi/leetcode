package io.github.cchenxi.leetcode.algorithm2.p127;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * {@link Solution01}
 * Date: 2021-10-20
 *
 * @author chenxi
 */
public class Solution02 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int result = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word =  queue.poll();
                for (int j = 0; j < word.length(); j++) {
                    char[] chars = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String tmp = new String(chars);
                        if (wordSet.contains(tmp)) {
                            if (tmp.equals(endWord)) {
                                return result + 1;
                            }
                            queue.add(tmp);
                            wordSet.remove(tmp);
                        }
                    }
                }
            }
            result++;
        }
        return 0;
    }
}

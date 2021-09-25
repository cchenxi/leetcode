package io.github.cchenxi.leetcode.algorithm1.n127WordLadder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * BFS
 * Date: 2020-08-30
 *
 * @author chenxi
 */
public class Solution_1_2 implements WordLadder {
    @Override
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                for (int j = 0; j < curr.length(); j++) {
                    char[] arr = curr.toCharArray();
                    for (char x = 'a'; x <= 'z'; x++) {
                        arr[j] = x;
                        String temp = new String(arr);
                        if (set.contains(temp)) {
                            if (temp.equals(endWord)) {
                                return level + 1;
                            }
                            queue.offer(temp);
                            set.remove(temp);
                        }
                    }
                }
            }

            level++;
        }

        return 0;
    }
}

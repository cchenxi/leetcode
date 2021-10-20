package io.github.cchenxi.leetcode.algorithm2.p127;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/word-ladder/description/">127. 单词接龙</a>
 * 类似二叉树层序遍历的解法（BFS）
 * Date: 2021-10-20
 *
 * @author chenxi
 */
public class Solution01 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        int result = 1;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                for (int j = 0; j < word.length(); j++) {
                    char[] chars = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String tmp = new String(chars);
                        if (set.contains(tmp)) {
                            if (tmp.equals(endWord)) {
                                return result + 1;
                            }
                            queue.add(tmp);
                            set.remove(tmp);
                        }
                    }
                }
            }
            result++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        System.out.println(
                solution.ladderLength("hit", "cog",
                        Lists.newArrayList("hot","dot","dog","lot","log","cog"))
        );
    }
}

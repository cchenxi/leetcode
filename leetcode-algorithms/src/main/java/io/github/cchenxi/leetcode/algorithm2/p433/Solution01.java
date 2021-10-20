package io.github.cchenxi.leetcode.algorithm2.p433;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-genetic-mutation">433. 最小基因变化</a>
 * 同 {@link io.github.cchenxi.leetcode.algorithm2.p127.Solution01} 单词接龙
 * Date: 2021-10-20
 *
 * @author chenxi
 */
public class Solution01 {
    public int minMutation(String start, String end, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        char[] elements = new char[]{'A', 'C', 'G', 'T'};

        int result = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                for (int j = 0; j < word.length(); j++) {
                    char[] chars = word.toCharArray();
                    for (int k = 0; k < elements.length; k++) {
                        if (chars[j] == elements[k]) {
                            continue;
                        }
                        chars[j] = elements[k];
                        String tmp = new String(chars);
                        if (bankSet.contains(tmp)) {
                            if (tmp.equals(end)) {
                                return result + 1;
                            }
                            queue.add(tmp);
                            bankSet.remove(tmp);
                        }
                    }
                }
            }
            result++;
        }
        return -1;
    }
}

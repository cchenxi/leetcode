package io.github.cchenxi.leetcode.algorithm2.p819;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/most-common-word/">819. 最常见的单词</a>
 * Date: 2021-09-23
 *
 * @author chenxi
 */
public class Solution01 {
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (sb.length() > 0) {
                words.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0) {
            words.add(sb.toString());
        }

        PriorityQueue<String[]> queue = new PriorityQueue<>((s1, s2) -> Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]));

        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.merge(s, 1, Integer::sum);
        }

        map.forEach((k, v) -> queue.offer(new String[]{k, String.valueOf(v)}));
        Set<String> set = new HashSet<>(Arrays.asList(banned));

        String result = "";
        while (!queue.isEmpty()) {
            String[] element = queue.poll();
            if (!set.contains(element[0])) {
                return element[0];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        System.out.println(
                solution.mostCommonWord(
                        "Bob",
                        new String[]{}
                )
        );
    }
}

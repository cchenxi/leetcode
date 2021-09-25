package io.github.cchenxi.leetcode.algorithm2.exam0815;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * TODO: description
 * Date: 2021-08-15
 *
 * @author chenxi
 */
public class Solution01 {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        Map<Character, Integer> map = new HashMap<>(s.length());
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Map<Integer, List<Character>> map1 = new TreeMap<>(Comparator.reverseOrder());
        map.forEach((c, i) -> {
            if (map1.get(i) == null) {
                List<Character> cl = new ArrayList<>();
                cl.add(c);
                map1.put(i, cl);
            } else {
                map1.get(i).add(c);
            }
        });

        StringBuilder sb = new StringBuilder();
        map1.forEach((i, cl) -> {
            cl.forEach(c -> {
                for (int j = 0; j < i; j++) {
                    sb.append(c);
                }
            });
        });
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        System.out.println(
                solution01.frequencySort("Aabb")
        );
    }
}

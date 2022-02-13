package io.github.cchenxi.leetcode.algorithm2.p1189;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-number-of-balloons/">1189. “气球” 的最大数量</a>
 * Date: 2022-02-13
 *
 * @author chenxi
 */
public class Solution01 {
    public int maxNumberOfBalloons(String text) {
        char[] chars = new char[]{'b', 'a', 'l', 'o', 'n'};

        Map<Character, Integer> charCountMap = new HashMap<>(5);
        for (char c : chars) {
            charCountMap.put(c, 0);
        }

        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            if (!charCountMap.containsKey(c)) {
                continue;
            }
            int count = charCountMap.getOrDefault(c, 0) + 1;
            charCountMap.put(c, count);
        }

        int max = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            Character k = entry.getKey();
            Integer v = entry.getValue();
            if (k == 'l' || k == 'o') {
                v = v / 2;
            }
            max = Math.min(max, v);
        }
        return max;
    }
}

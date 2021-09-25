package io.github.cchenxi.leetcode.p13;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/roman-to-integer/">13. 罗马数字转整数</a>
 * Date: 2021-09-23
 *
 * @author chenxi
 */
public class Solution01 {
    private static final Map<Character, Character> MAP = new HashMap<>();

    private static final Map<Character, Integer> CHAR_VALUE_MAP = new HashMap<>();

    static {
        MAP.put('V', 'I');
        MAP.put('X', 'I');
        MAP.put('L', 'X');
        MAP.put('C', 'X');
        MAP.put('D', 'C');
        MAP.put('M', 'C');

        CHAR_VALUE_MAP.put('I', 1);
        CHAR_VALUE_MAP.put('V', 5);
        CHAR_VALUE_MAP.put('X', 10);
        CHAR_VALUE_MAP.put('L', 50);
        CHAR_VALUE_MAP.put('C', 100);
        CHAR_VALUE_MAP.put('D', 500);
        CHAR_VALUE_MAP.put('M', 1000);
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int index = s.length() - 1;
        int result = 0;

        while (index >= 0) {
            char c = chars[index];
            if (index >= 1) {
                char pre = chars[index - 1];
                char val = MAP.getOrDefault(c, ' ');
                if (val == pre) {
                    result += (CHAR_VALUE_MAP.get(c) - CHAR_VALUE_MAP.get(pre));
                    index--;
                } else {
                    result += CHAR_VALUE_MAP.get(c);
                }
            } else {
                result += CHAR_VALUE_MAP.get(c);
            }
            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        System.out.println(
                solution.romanToInt("MCMXCIV")
        );
    }
}

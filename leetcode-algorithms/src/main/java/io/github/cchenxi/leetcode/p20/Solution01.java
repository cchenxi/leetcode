package io.github.cchenxi.leetcode.p20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/valid-parentheses/">20. 有效的括号</a>
 * Date: 2021-08-15
 *
 * @author chenxi
 */
public class Solution01 {
    private static final Map<Character, Character> MAP = new HashMap<>(3);

    static {
        MAP.put(')', '(');
        MAP.put(']', '[');
        MAP.put('}', '{');
    }

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (MAP.containsValue(c)) {
                stack.push(c);
                continue;
            }
            if (MAP.containsKey(c)) {
                if (!stack.isEmpty() && MAP.get(c).equals(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

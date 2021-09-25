package io.github.cchenxi.leetcode.algorithm2.p20;

import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/valid-parentheses/">20. 有效的括号</a>
 * Date: 2021-08-15
 *
 * @author chenxi
 */
public class Solution02 {
    public boolean isValid(String s) {
       if (s.length() % 2 == 1) {
           return false;
       }

       Stack<Character> stack = new Stack<>();
       for (char c : s.toCharArray()) {
           if (c == '(') {
               stack.push(')');
           } else if (c == '{') {
               stack.push('}');
           } else if (c == '[') {
               stack.push(']');
           } else if (stack.isEmpty() || stack.pop() != c) {
               return false;
           }
       }

       return stack.isEmpty();
    }
}

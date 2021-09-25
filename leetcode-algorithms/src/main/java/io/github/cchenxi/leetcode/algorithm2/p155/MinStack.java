package io.github.cchenxi.leetcode.algorithm2.p155;

import java.util.Stack;

/**
 * @see <a href="https://leetcode-cn.com/problems/min-stack/">最小栈</a>
 * Date: 2021-08-15
 *
 * @author chenxi
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

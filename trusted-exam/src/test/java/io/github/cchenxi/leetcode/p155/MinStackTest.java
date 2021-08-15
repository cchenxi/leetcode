package io.github.cchenxi.leetcode.p155;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2021-08-15
 *
 * @author chenxi
 */
public class MinStackTest {
    private MinStack minStack;

    @Before
    public void setUp() throws Exception {
        minStack = new MinStack();
    }

    @Test
    public void testMinStack() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        Assert.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-2, minStack.getMin());
    }
}
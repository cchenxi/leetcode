package com.cchenxi.leetcode.algorithm.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-16
 *
 * @author chenxi
 */
public class BubbleSortTest {
    private BubbleSort c;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        c = new BubbleSort();
        array = new int[]{1, 2, 3, 7, 6, 10, 25, 9, 11};
    }

    @Test
    public void sort() {
        c.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
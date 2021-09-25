package io.github.cchenxi.leetcode.algorithm1.demo.sort;

import io.github.cchenxi.leetcode.algorithm1.demo.sort.InsertionSort;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-16
 *
 * @author chenxi
 */
public class InsertionSortTest {
    private InsertionSort c;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        c = new InsertionSort();
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
package io.github.cchenxi.leetcode.algorithm1.demo.sort;

import io.github.cchenxi.leetcode.algorithm1.demo.sort.QuickSort;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-16
 *
 * @author chenxi
 */
public class QuickSortTest {
    private QuickSort c;
    private int[] array;

    @Before
    public void setUp() throws Exception {
        c = new QuickSort();
        array = new int[]{1, 2, 3, 7, 6, 10, 25, 9, 11};
    }

    @Test
    public void sort() {
        c.sort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
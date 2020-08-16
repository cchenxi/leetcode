package com.cchenxi.leetcode.algorithm.sort;

/**
 * 选择排序
 * Date: 2020-08-16
 *
 * @author chenxi
 */
public class SelectionSort {
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            //在未排序的部分中选择最小的值
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            //swap
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }
}

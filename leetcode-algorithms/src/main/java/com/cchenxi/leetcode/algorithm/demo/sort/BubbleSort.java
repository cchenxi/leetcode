package com.cchenxi.leetcode.algorithm.demo.sort;

/**
 * 冒泡排序
 * Date: 2020-08-16
 *
 * @author chenxi
 */
public class BubbleSort {
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}

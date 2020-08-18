package com.cchenxi.leetcode.algorithm.demo.sort;

/**
 * 快速排序
 * Date: 2020-08-16
 *
 * @author chenxi
 */
public class QuickSort {
    public void sort(int[] array, int begin, int end) {
        if (array == null || array.length == 0 || begin >= end) {
            return;
        }

        int pivot = partition(array, begin, end);
        sort(array, begin, pivot - 1);
        sort(array, pivot + 1, end);
    }

    private int partition(int[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int tmp = array[counter];
                array[counter] = array[i];
                array[i] = tmp;

                counter++;
            }
        }

        int tmp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = tmp;

        return counter;
    }
}

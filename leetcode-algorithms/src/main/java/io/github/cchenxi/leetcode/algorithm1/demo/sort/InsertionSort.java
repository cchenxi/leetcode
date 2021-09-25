package io.github.cchenxi.leetcode.algorithm1.demo.sort;

/**
 * 插入排序
 * Date: 2020-08-16
 *
 * @author chenxi
 */
public class InsertionSort {
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int j = i - 1;

            //在已排序序列中从后向前扫描，找到相应位置并插入
            while (j >= 0 && array[j] > curr) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = curr;
        }
    }
}

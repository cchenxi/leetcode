package io.github.cchenxi.leetcode.algorithm1.demo.sort;

/**
 * 归并排序
 * Date: 2020-08-16
 *
 * @author chenxi
 */
public class MergeSort {
    public void sort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) >> 1;

        sort(array, left, mid);
        sort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // 中间数组
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        while (i <= mid)   temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }
}

package io.github.cchenxi.leetcode.p56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/merge-intervals/">56. 合并区间</a>
 * Date: 2021-08-18
 *
 * @author chenxi
 */
public class Solution01 {
    public int[][] merge(int[][] intervals) {

        // 排序，使数组第一个元素有序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // 存放结果，未知总数，所以定义成List
        List<int[]> result = new ArrayList<>();

        // 取出第一个
        int[] cur = intervals[0];

        // 从第二个开始遍历
        for (int i = 1; i < intervals.length; i++) {
            // 当前数组的第一个元素 > 前一个数组的第二个元素。则不重合。将前一个元素加到结果中。当前数组作为前一个，下标移动。
            if (intervals[i][0] > cur[1]) {
                result.add(cur);
                cur = intervals[i];
            }
            // 当前数组的第一个元素 <= 前一个数组的第二个元素。重合。需要合并到前一个数组中。前一个数组的第二个元素需要比较前一个数组和当前数组的第二个元素，取最大值。
            else {
                cur[1] = Math.max(cur[1], intervals[i][1]);
            }
        }

        // 以上循环总是会遗忘最后一个当前数组，所以要添加到结果中。
        result.add(cur);

        // list转换成数组
        return result.toArray(new int[result.size()][2]);
    }
}

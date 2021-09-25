package io.github.cchenxi.leetcode.algorithm1.n56MergeIntervals;

import io.github.cchenxi.leetcode.algorithm1.n56MergeIntervals.MergeIntervals;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-16
 *
 * @author chenxi
 */
public class MergeIntervalsTest {
    private MergeIntervals c;
    private int[][] intervals;

    @Before
    public void setUp() throws Exception {
        c = new MergeIntervals();
        intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}, {10, 11}};
    }

    @Test
    public void merge() {
        int[][] result = c.merge(intervals);
        System.out.println(result);
    }
}
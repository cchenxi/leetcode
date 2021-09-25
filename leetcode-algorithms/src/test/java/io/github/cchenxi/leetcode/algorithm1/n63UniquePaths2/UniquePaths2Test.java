package io.github.cchenxi.leetcode.algorithm1.n63UniquePaths2;

import io.github.cchenxi.leetcode.algorithm1.n63UniquePaths2.UniquePaths2;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-02
 *
 * @author chenxi
 */
public class UniquePaths2Test {
    private UniquePaths2 c;
    int[][] arr;

    @Before
    public void setUp() throws Exception {
        c = new UniquePaths2();
        arr = new int[][]{
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
    }

    @Test
    public void uniquePathsWithObstacles() {
        System.out.println(
            c.uniquePathsWithObstacles(arr)
        );
    }
}
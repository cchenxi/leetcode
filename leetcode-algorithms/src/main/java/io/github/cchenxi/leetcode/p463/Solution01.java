package io.github.cchenxi.leetcode.p463;

/**
 * <a href="https://leetcode-cn.com/problems/island-perimeter/">463. 岛屿的周长</a>
 * Date: 2021-09-25
 *
 * @author chenxi
 */
public class Solution01 {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }

                if (i == 0 || grid[i-1][j] == 0) {
                    result++;
                }
                if (i == rows - 1 || grid[i + 1][j] == 0) {
                    result++;
                }
                if (j == 0 || grid[i][j - 1] == 0) {
                    result++;
                }
                if (j == cols - 1 || grid[i][j + 1] == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}

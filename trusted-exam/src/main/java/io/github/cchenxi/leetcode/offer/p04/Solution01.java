package io.github.cchenxi.leetcode.offer.p04;

/**
 * @see <a href="https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/">剑指 Offer 04. 二维数组中的查找</a>
 * Date: 2021-09-21
 *
 * @author chenxi
 */
public class Solution01 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int column = n - 1;

        while (row < m && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }

        return false;
    }
}

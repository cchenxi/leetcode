package io.github.cchenxi.leetcode.simulation.m20210905;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO: description
 * Date: 2021-09-05
 *
 * @author chenxi
 */
public class Main09 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;
        for (int i = 0; i < length; i++) {
            sum = sum + mat[i][i] + mat[i][length - i - 1];
        }

        if (length%2 == 1) {
            sum -= mat[length / 2][length / 2];
        }
        return sum;
    }
}

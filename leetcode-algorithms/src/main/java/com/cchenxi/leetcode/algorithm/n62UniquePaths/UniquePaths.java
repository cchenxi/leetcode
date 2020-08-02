package com.cchenxi.leetcode.algorithm.n62UniquePaths;

/**
 * https://leetcode-cn.com/problems/unique-paths/
 *
 * Date: 2020-08-02
 *
 * @author chenxi
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
//        return m1(0, 0, m, n);
//        int[][] mem = new int[m][n];
//        return m2(0, 0, m, n, mem);
//        return m11(m, n);
//        int[][] mem = new int[m+1][n+1];
//        return m21(m, n, mem);
//        return m3(m, n);
        return m31(m, n);
    }

    //递归
    private int m1(int i, int j, int m, int n) {
        if (i >= m || j >= n) {
            return 0;
        }

        if (i + 1 == m && j + 1 == n) {
            return 1;
        }

        return m1(i + 1, j, m, n) + m1(i, j + 1, m, n);
    }

    //递归
    private int m11(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }

        if (m == 1 && n == 1) {
            return 1;
        }

        return m11(m - 1, n) + m11(m, n - 1);
    }

    //递归 + 数组
    private int m2(int i, int j, int m, int n, int[][] mem) {
        if (i >= m || j >= n) {
            return 0;
        }

        if (i + 1 == m && j + 1 == n) {
            return 1;
        }

        if (mem[i][j] == 0) {
            mem[i][j] = m2(i + 1, j, m, n, mem) + m2(i, j + 1, m, n, mem);
        }

        return mem[i][j];
    }

    //递归 + 数组
    private int m21(int m, int n, int[][] arr) {
        if (m <= 0 || n <= 0) {
            return 0;
        }

        if (m == 1 && n == 1) {
            return 1;
        }

        if (arr[m][n] == 0) {
            arr[m][n] = m21(m - 1, n, arr) + m21(m, n - 1, arr);
        }
        return arr[m][n];
    }

    /**
     * 某一点到终点的走法数量 = 某一点右点到终点的走法数量 + 某一点下点到终点的走法数量
     * 静态终点
     * 动态起点
     *
     * @param m
     * @param n
     * @return
     */
    private int m3(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i][n - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            arr[m -1][i] = 1;
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                arr[i][j] = arr[i + 1][j] + arr[i][j + 1];
            }
        }

        return arr[0][0];
    }

    /**
     * 起点到某一点的走法数量 = 起点到某一点上一点的走法数量 + 起点到某一点左一点的走法数量
     * 静态起点
     * 动态终点
     *
     * @param m
     * @param n
     * @return
     */
    private int m31(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            arr[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //递推需要考虑 依赖的数据是否已经求过解
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }

        return arr[m - 1][n - 1];
    }
}

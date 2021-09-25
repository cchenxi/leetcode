package io.github.cchenxi.leetcode.algorithm1.n120Triangle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * <p>
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * <p>
 *  
 * <p>
 * 例如，给定三角形：
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * Date: 2020-08-13
 *
 * @author chenxi
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        return m1(triangle);
    }

    /**
     * 暴力求解
     *
     * 从上往下
     * 从正数第2行开始
     * 注意控制边界
     *
     * @param triangle
     * @return
     */
    public int m1(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) {
            return 0;
        }
        if(triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (i == 1) {
                    triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i - 1).get(0));
                } else {
                    if (j == 0) {
                        triangle.get(i).set(j, triangle.get(i - 1).get(j) + triangle.get(i).get(j));
                    } else if (j == triangle.get(i).size() - 1) {
                        triangle.get(i).set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i).get(j));
                    } else {
                        int upLeft = triangle.get(i - 1).get(j - 1);
                        int upRight = triangle.get(i - 1).get(j);
                        triangle.get(i).set(j, Math.min(upLeft, upRight) + triangle.get(i).get(j));
                    }
                }
            }

            if (i == triangle.size() - 1) {
                triangle.get(i).sort(Comparator.naturalOrder());
                return triangle.get(i).get(0);
            }
        }

        return 0;
    }

    /**
     * 自下往上
     * f(i, j) += Math.min(f(i + 1, j), f(i + 1, j + 1))
     *
     * @param triangle
     * @return
     */
    public int m2(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> currentRow = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                int bottomLeft = triangle.get(i + 1).get(j);
                int bottomRight = triangle.get(i + 1).get(j + 1);
                currentRow.set(j, Math.min(bottomLeft, bottomRight) + currentRow.get(j));
            }
        }
        return triangle.get(0).get(0);
    }
}

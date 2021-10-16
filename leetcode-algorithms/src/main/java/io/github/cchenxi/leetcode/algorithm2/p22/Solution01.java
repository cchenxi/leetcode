package io.github.cchenxi.leetcode.algorithm2.p22;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/generate-parentheses/">22. 括号生成</a>
 * Date: 2021-10-16
 *
 * @author chenxi
 */
public class Solution01 {
    private List<String> result;

    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        generate(0, 0, n, "");
        return result;
    }

    private void generate(int left, int right, int n, String s) {
        // terminator
        if (left == n && right == n) {
            result.add(s);
            return;
        }

        // process current logic

        // drill down
        if (left < n) {
            generate(left + 1, right, n, s + '(');
        }
        if (left > right) {
            generate(left, right + 1, n, s + ')');
        }

        // reverse states
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        System.out.println(
                solution.generateParenthesis(3)
        );
    }
}

package io.github.cchenxi.leetcode.algorithm2.p6;

/**
 * @see <a href="https://leetcode-cn.com/problems/zigzag-conversion/">6. Z字形变换</a>
 * Date: 2021-08-17
 *
 * @author chenxi
 */
public class Solution01 {

    /**
     * 变形，压缩
     *
     * A     G     M    A   G   M
     * B   F H   L N => B F H L N
     * C E   I K   O    C E I K O
     * D     J     P    D   J   P
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }

        int i = 0;
        while (i < s.length()) {
            int currRow = 0;
            while (currRow < numRows && i < s.length()) {
                sbs[currRow++].append(s.charAt(i++));
            }

            currRow -= 2;

            while (currRow > 0 && i < s.length()) {
                sbs[currRow--].append(s.charAt(i++));
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : sbs) {
            result.append(sb.toString());
        }

        return result.toString();
    }
}

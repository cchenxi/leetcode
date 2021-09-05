package io.github.cchenxi.leetcode.simulation.m20210905;

/**
 * TODO: description
 * Date: 2021-09-05
 *
 * @author chenxi
 */
public class Main07 {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (length == 0 && c == ' ') {
                continue;
            }
            if (length > 0 && c == ' ') {
                return length;
            }
            if (c != ' ') {
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Main07 main07 = new Main07();
        System.out.println(
                main07.lengthOfLastWord(" ")
        );
    }
}

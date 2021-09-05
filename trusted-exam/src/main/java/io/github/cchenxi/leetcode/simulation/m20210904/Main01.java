package io.github.cchenxi.leetcode.simulation.m20210904;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 *
 *
 *
 * 示例：
 * 输入：S = "a1b2"
 * 输出：["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * 输入：S = "3z4"
 * 输出：["3z4", "3Z4"]
 *
 * 输入：S = "12345"
 * 输出：["12345"]
 * Date: 2021-09-04
 *
 * @author chenxi
 */
public class Main01 {
    public List<String> letterCasePermutation(String s) {

        System.out.println((int) 'a');
        System.out.println((int) 'A');
        System.out.println((int) 'z');
        System.out.println((int) 'Z');

        char[] chars = s.toCharArray();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            char c = s.charAt(i);
            char[] cs = chars;
            if (c >= 97 && c <= 122) {
                cs[i] = (char) (c - 32);
                result.add(new String(cs));
            } else if (c >= 65 && c <= 90) {
                cs[i] = (char) (c + 32);
                result.add(new String(cs));
            }
        }
        result.add(s);
        return result;
    }

    public static void main(String[] args) {
        Main01 main01 = new Main01();
        System.out.println(main01.letterCasePermutation("a1b2"));
    }
}

package io.github.cchenxi.leetcode.algorithm2.p3;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href = "https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/">无重复字符的最长子串</a>
 * - 双指针
 * - 滑动窗口
 *
 * Date: 2021-08-01
 *
 * @author chenxi
 */
public class Solution01 {
    public int lengthOfLongestSubstring(String s) {
        // 异常场景
        if (s == null || s.length() == 0) {
            return 0;
        }

        // 初始大小
        int maxLength = 1;
        // hashmap 存储 字符 => 位置
        Map<Character, Integer> charIndexMap = new HashMap<>(s.length());
        // 双指针
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            // 当前字符
            char c = s.charAt(i);

            // hashmap中已经存在当前字符，此前遍历过程中已经遍历过了
            if (charIndexMap.containsKey(c)) {
                // 比较 "上一次出现这个字符的下一个位置" 和 "当前的left位置" 的较大值
                // 例如 "abba" i=3时，
                // 'a'上一次出现的位置+1 = 1
                // 当前left的位置为 2
                // 取1显然是不对的，left的位置只能向后移动，不能折返回去，所以要取较大值
                left = Math.max(charIndexMap.get(c) + 1, left);
            }

            // 计算公式 i- left + 1
            if (i - left + 1 > maxLength) {
                maxLength = i - left + 1;
            }

            charIndexMap.put(c, i);
        }

        return maxLength;
    }
}

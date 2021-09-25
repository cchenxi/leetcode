package io.github.cchenxi.leetcode.algorithm2.p929;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode-cn.com/problems/unique-email-addresses/">929. 独特的电子邮件地址</a>
 * Date: 2021-09-22
 *
 * @author chenxi
 */
public class Solution01 {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email : emails) {
            String[] emailArray = email.split("@");
            String local = emailArray[0];
            char[] chars = new char[local.length()];
            int i = 0;
            for (char c : local.toCharArray()) {
                if (c == '+') {
                    break;
                }
                if (c == '.') {
                    continue;
                }
                chars[i++] = c;
            }
            char[] localChars = Arrays.copyOf(chars, i);
            String emailAddress = String.valueOf(localChars) + "@" + emailArray[1];
            emailSet.add(emailAddress);
        }

        return emailSet.size();
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        String[] emails = new String[]{
                "test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"
        };
        solution.numUniqueEmails(emails);
    }
}

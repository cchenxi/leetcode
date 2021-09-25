package io.github.cchenxi.leetcode.algorithm2.simulation.m20210905;

/**
 * Date: 2021-09-05
 *
 * @author chenxi
 */
public class Main04 {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num/10 != 0) {
            sum += (num % 10);
            num = num / 10;
        }
        sum += num;
        return addDigits(sum);
    }

    public static void main(String[] args) {
        Main04 main04 = new Main04();
        System.out.println(main04.addDigits(38));
    }
}

package com.cchenxi.leetcode.algorithm.interview.mi;

import java.util.Arrays;

/**
 * 2018-12-15 mi interview
 * Date: 2020-09-08
 *
 * @author chenxi
 */
public class RemoveRepetitiveNumbers {
    public int removeRepetitiveNumbers(int[] input) {
        if (input == null || input.length == 0) {
            return 0;
        }

        if (input.length == 1) {
            return 1;
        }

        Arrays.sort(input);

        int j = 0;
        for (int i = 1; i < input.length; i++) {
            if(input[i] != input[j]) {
                input[++j] = input[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3, 3, 4, 5, 3, 2, 7, 3, 3, 1};
        RemoveRepetitiveNumbers c = new RemoveRepetitiveNumbers();
        c.removeRepetitiveNumbers(input);
    }
}

/*

package com.chenxi.test;

import java.util.Random;

//没有经验 见识短
没有和考官确认题目内容
public class Interview {
    *//**
     * 移除数组中的重复数字
     *
     * @param input
     * @param n
     * @return
     *//*
    private static int removeRepetitiveNumbers(int[] input, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int resultLength = input.length;
        for (int i = 0; i < resultLength; i++) {
            for (int j = i + 1; j < resultLength; j++) {
                //重复 则放置到最后，同时元素总数-1，j回退一位
                if (input[i] == input[j]) {
                    input[j] = input[resultLength - 1];
                    resultLength--;
                    j--;
                }
            }
        }
        return resultLength;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int length = 20;
        int bound = 15;
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = random.nextInt(bound);
        }

        length = removeRepetitiveNumbers(intArray, length);
        for (int i = 0; i < length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}*/


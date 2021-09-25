package io.github.cchenxi.leetcode.algorithm1.n1518;

/**
 * Date: 2020-07-25
 *
 * @author chenxi
 */
public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles < numExchange) {
            return numBottles;
        }
        int total = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            empty -= numExchange;
            ++total;
            ++empty;
        }

        return total;
    }
}

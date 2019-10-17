package com.cchenxi.leetcode.algorithm.p26;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates() {
        int[] input = {1, 1, 2, 3, 3, 10, 14, 14};
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        Assert.assertEquals(removeDuplicatesFromSortedArray.removeDuplicates(input), 5);
    }
}
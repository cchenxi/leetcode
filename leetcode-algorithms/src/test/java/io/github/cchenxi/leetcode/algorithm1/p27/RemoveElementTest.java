package io.github.cchenxi.leetcode.algorithm1.p27;

import io.github.cchenxi.leetcode.algorithm1.p27.RemoveElement;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

import static org.junit.Assert.assertTrue;


/**
 * 27
 * Date: 2019-10-21
 *
 * @author chenxi
 */
public class RemoveElementTest {
    @Test
    public void removeElement() {
        int[] nums = {3,2,2,3};
        int val = 3;
        RemoveElement removeElement = new RemoveElement();
        int length = removeElement.removeElement(nums, val);
        System.out.println(JSON.toJSONString(nums));
        assertTrue(length==2);
    }
}
package io.github.cchenxi.leetcode.algorithm1.n120Triangle;

import java.util.Arrays;
import java.util.List;

import io.github.cchenxi.leetcode.algorithm1.n120Triangle.Triangle;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-08-13
 *
 * @author chenxi
 */
public class TriangleTest {
    private Triangle c;
    private List<List<Integer>> cases;
    private List<List<Integer>> cases1;

    @Before
    public void setUp() throws Exception {
        c = new Triangle();
        cases = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        cases1 = Arrays.asList(
                Arrays.asList(-10)
        );
    }

    @Test
    public void minimumTotal() {
        System.out.println(
                c.minimumTotal(cases)
        );
        System.out.println(
                c.m2(cases1)
        );
    }
}
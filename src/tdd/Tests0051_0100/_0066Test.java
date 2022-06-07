package src.tdd.Tests0051_0100;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0051_0100._0058;
import src.Classes0051_0100._0066;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class _0066Test {

    private static _0066 solution;

    private int[] expected, nums;

    @BeforeClass
    public void setup() {solution = new _0066();}

    @Test
    public void test1() {
        nums = new int[]{1,2,3};
        expected = new int[]{1,2,4};
        assertArrayEquals(expected, solution.plusOne(nums));
    }
    @Test
    public void test2() {
        nums = new int[]{4,3,2,1};
        expected = new int[]{4,3,2,2};
        assertArrayEquals(expected, solution.plusOne(nums));
    }
    @Test
    public void test3() {
        nums = new int[]{9};
        expected = new int[]{1,0};
        assertArrayEquals(expected, solution.plusOne(nums));
    }
    @Test
    public void test4() {
        nums = new int[]{9,9,9,9,9};
        expected = new int[]{1,0,0,0,0,0};
        assertArrayEquals(expected, solution.plusOne(nums));
    }
    @Test
    public void test5() {
        nums = new int[]{0,1,9,9};
        expected = new int[]{0,2,0,0};
        assertArrayEquals(expected, solution.plusOne(nums));
    }



}

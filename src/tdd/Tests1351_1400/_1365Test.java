package src.tdd.Tests1351_1400;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0501_0550._0509;
import src.Classes1351_1400._1365;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class _1365Test {

    private static _1365 solution;

    private static int[] nums;

    private static int[] expected;

    @BeforeClass
    public void setup() {solution = new _1365();}

    @Test
    public void test1() {
        nums = new int[]{8, 1, 2, 2, 3};
        expected = new int[]{4, 0, 1, 1, 3};
        assertArrayEquals(expected, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void test2() {
        nums = new int[]{6, 5, 4, 8};
        expected = new int[]{2, 1, 0, 3};
        assertArrayEquals(expected, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void test3() {
        nums = new int[]{7, 7, 7, 7};
        expected = new int[]{0, 0, 0, 0};
        assertArrayEquals(expected, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void test4() {
        nums = new int[]{6, 5, 4, 8};
        expected = new int[]{2, 1, 0, 3};
        assertArrayEquals(expected, solution.smallerNumbersThanCurrent(nums));
    }
}

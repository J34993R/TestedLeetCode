package src.tdd.Tests0951_1000;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0901_0950._0905;
import src.Classes0951_1000._0977;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class _0977Test {

    private static _0977 solution;

    private static int[] nums;
    private static int[] expected;

    @BeforeClass
    public void setup(){ solution = new _0977(); }

    @Test
    public void test1(){
        nums = new int[] {-4,-1,0,3,10};
        expected = new int[] {0,1,9,16,100};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

    @Test
    public void test2(){
        nums = new int[] {-7,-3,2,3,11};
        expected = new int[] {4,9,9,49,121};
        assertArrayEquals(expected, solution.sortedSquares(nums));
    }

}

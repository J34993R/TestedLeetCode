package src.tdd.Tests0901_0950;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0901_0950._0905;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class _0905Test {

    private static _0905 solution;

    private static int[] nums;
    private static int[] expected;

    @BeforeClass
    public void setup(){ solution = new _0905(); }

    @Test
    public void test1(){
        nums = new int[] {3,1,2,4};
        expected = new int[] {4,2,1,3};
        assertArrayEquals(expected, solution.sortArrayByParity(nums));
    }

    @Test
    public void test2(){
        nums = new int[] {0};
        expected = new int[] {0};
        assertArrayEquals(expected, solution.sortArrayByParity(nums));
    }

}

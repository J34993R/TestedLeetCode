package src.tdd.Tests0051_0100;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0051_0100._0070;
import src.Classes0051_0100._0090;

import static org.testng.AssertJUnit.assertEquals;

public class _0090Test {

    private static _0090 solution;

    private static int[] nums;
    private static int[] expected;

    @BeforeClass
    public void setup(){ solution = new _0090(); }

    @Test
    public void test1(){
        nums = new int[] {3,1,2,4};
        expected = new int[] {2,4,3,1};
        assertEquals(expected, solution.sortArrayByParity(nums));
    }

    @Test
    public void test2(){
        nums = new int[] {0};
        expected = new int[] {0};
        assertEquals(expected, solution.sortArrayByParity(nums));
    }

}

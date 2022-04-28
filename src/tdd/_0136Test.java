package src.tdd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Array._0136;

import static org.testng.AssertJUnit.assertEquals;

public class _0136Test {

    private static _0136 solution;

    private static int[] nums;

    @BeforeClass
    public void setup(){ solution = new _0136(); }

    @Test
    public void test1(){
        nums = new int[] {2,2,1};
        assertEquals(1, solution.singleNumber(nums));
    }
    @Test
    public void test2(){
        nums = new int[] {4,1,2,1,2};
        assertEquals(4, solution.singleNumber(nums));
    }
    @Test
    public void test3(){
        nums = new int[] {1};
        assertEquals(1, solution.singleNumber(nums));
    }
}

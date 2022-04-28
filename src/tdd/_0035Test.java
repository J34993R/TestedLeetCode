package src.tdd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Array._0035;

import static org.testng.AssertJUnit.assertEquals;

public class _0035Test {

    private static _0035 solution;

    private static int[] nums;

    private static int target;

    @BeforeClass
    public void setup(){ solution = new _0035(); }

    @Test
    public void test1(){
        nums = new int[] {1,3,5,6};
        target = 5;
        assertEquals(2, solution.searchInsert(nums, target));
    }

    @Test
    public void test2(){
        nums = new int[] {1,3,5,6};
        target = 2;
        assertEquals(1, solution.searchInsert(nums, target));
    }

}

package src.tdd;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Array._0001;

import static org.testng.AssertJUnit.assertEquals;

public class _0001Test {

    private static _0001 solution;

    private static int[] expected;
    private static int[] nums;

    private static int target;

    @BeforeClass
    public void setup(){ solution = new _0001(); }

    @Test
    public void test1(){
        nums = new int[] {2,7,11,15};
        target = 9;
        assertEquals(expected = new int[] {0,1}, solution.twoSum(nums, target));
    }

    @Test
    public void test2(){
        nums = new int[] {2,7,11,15};
        target = 9;
        expected = new int[] {0,1};
        assertEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void test3(){
        nums = new int[] {3,2,4};
        target = 6;
        expected = new int[] {1,2};
        assertEquals(expected, solution.twoSum(nums, target));
    }
}

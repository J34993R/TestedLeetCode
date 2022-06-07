package src.tdd.Tests0000_0050;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0000_0050._0026;
import src.Classes0000_0050._0027;

import static org.testng.AssertJUnit.assertEquals;

public class _0027Test {

    private _0027 solution;

    private int[] nums;
    private int val;

    @BeforeClass
    public void setup() {solution = new _0027();}

    @Test
    public void test1() {
        nums = new int[] {3,2,2,3};
        val = 3;
        assertEquals(2, solution.removeElement(nums, val));
    }
    @Test
    public void test2() {
        nums = new int[] {0,1,2,2,3,0,4,2};
        val = 2;
        assertEquals(5, solution.removeElement(nums, val));
    }


}

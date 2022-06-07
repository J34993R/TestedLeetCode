package src.tdd.Tests0000_0050;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0000_0050._0014;
import src.Classes0000_0050._0016;

import static org.testng.AssertJUnit.assertEquals;

public class _0016Test {

    private _0016 solution;

    private int[] nums;

    private int target;

    @BeforeClass
    public void setup() {solution = new _0016();}

    @Test
    public void test1() {
        nums = new int[]{-1, 2, 1, -4};
        target = 1;
        assertEquals(2, solution.threeSumClosest(nums, target));
    }

    @Test
    public void test2() {
        nums = new int[]{0, 0, 0};
        target = 1;
        assertEquals(0, solution.threeSumClosest(nums, target));
    }


}

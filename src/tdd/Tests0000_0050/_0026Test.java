package src.tdd.Tests0000_0050;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0000_0050._0009;
import src.Classes0000_0050._0026;

import static org.testng.AssertJUnit.assertEquals;

public class _0026Test {

    private _0026 solution;

    private int[] nums;

    @BeforeClass
    public void setup() {solution = new _0026();}

    @Test
    public void test1() {
        nums = new int[] {1,1,2};
        assertEquals(2, solution.removeDuplicates(nums));
    }
    @Test
    public void test2() {
        nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, solution.removeDuplicates(nums));
    }

}

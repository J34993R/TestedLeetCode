package src.tdd.Tests0201_0250;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.Classes0201_0250._0202;
import src.Classes0201_0250._0217;

import static org.testng.AssertJUnit.assertEquals;

public class _0217Test {

    private static _0217 solution;

    private static int[] nums;

    @BeforeClass
    public void setup(){ solution = new _0217(); }

    @Test
    public void test1 (){
        nums = new int[] {1,2,3,1};
        assertEquals(true, solution.containsDuplicate(nums));
    }
    @Test
    public void test2 (){
        nums = new int[] {1,2,3,4};
        assertEquals(false, solution.containsDuplicate(nums));
    }
    @Test
    public void test3 (){
        nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        assertEquals(true, solution.containsDuplicate(nums));
    }



}
